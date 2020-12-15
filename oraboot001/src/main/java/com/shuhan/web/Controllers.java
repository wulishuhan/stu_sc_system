package com.shuhan.web;

import com.shuhan.mapper.ClassMapper;
import com.shuhan.mapper.accountMapper;
import com.shuhan.mapper.stMapper;
import com.shuhan.mapper.studentMapper;
import com.shuhan.model.Class;
import com.shuhan.model.account;
import com.shuhan.model.st;
import com.shuhan.model.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Controllers {

    @Resource
    accountMapper accountMapper;
    @Resource
    studentMapper studentMapper;
    @Resource
    stMapper stMapper;
    @Resource
    ClassMapper classMapper;



    @RequestMapping("cc")
    public String cc(Model model){
        return "login";
    }

    @PostMapping("login")
    public String login(Model model, HttpSession session, String username, String password){
        account account = accountMapper.findAccount(username,password);
        if (account==null) return "error";
        session.setAttribute("username",username);

        List<student> stulist= studentMapper.findAllstu();
        model.addAttribute("stulist",stulist);

        return "list";
    }

    @RequestMapping("/stulist")
    @ResponseBody
    public student login(String sno){
        return studentMapper.selectByPrimaryKey(sno);
    }

    @RequestMapping("/stlist")
    @ResponseBody
    public st stList(String sno){
        return stMapper.selectAllst(sno);
    }

    @RequestMapping("/classlist")
    @ResponseBody
    public Class classList(String clno){
        return classMapper.selectByPrimaryKey(clno);
    }


    @RequestMapping("list")
    public String list(HttpSession session,Model model){
        if (session.getAttribute("username")==null)
            return "error";
        return "list";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute("username");
        return "login";
    }




}
