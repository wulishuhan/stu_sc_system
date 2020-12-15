package com.shuhan.web;


import com.shuhan.mapper.accountMapper;
import com.shuhan.model.account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class loginController {

    @Resource
    accountMapper accountMapper;

    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("login_in")
    public String login_in(String username, String password, HttpSession session){
        account account=accountMapper.selectByPrimaryKey(username);
        if (account==null||!password.equals(account.getPwd()))
            return "error";
        session.setAttribute("username",account.getSno());
        return "index";
    }
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute("username");
        return "login";
    }

}
