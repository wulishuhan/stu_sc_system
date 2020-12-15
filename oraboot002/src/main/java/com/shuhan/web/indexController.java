package com.shuhan.web;

import com.shuhan.mapper.CallMapper;
import com.shuhan.mapper.courseMapper;
import com.shuhan.mapper.scMapper;
import com.shuhan.mapper.studentMapper;
import com.shuhan.model.sc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    @Resource
    CallMapper callMapper;

    @Resource
    studentMapper studentMapper;

    @Resource
    courseMapper courseMapper;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/stulist")
    @ResponseBody
    public List stulist(String sno){
        return studentMapper.selectByPrimaryKey(sno);
    }

    @RequestMapping("/stulists")
    @ResponseBody
    public List stulists(){
        return studentMapper.findallstudent();
    }

    @RequestMapping("/score")
    @ResponseBody
    public List score(Integer term){
        return studentMapper.findallscore(term);
    }

    @RequestMapping("/course")
    @ResponseBody
    public List course(){
        return courseMapper.findallcourse();
    }

    @Resource
    scMapper scMapper;

    @RequestMapping("/sclistinfo")
    @ResponseBody
    public List sclistinfo(){
        return scMapper.findallsclistinfo();
    }

    @ResponseBody
    @RequestMapping("callfun")
    public Map callfun(){
        Map map=new HashMap();
        map.put("sno","001");
        map.put("cno","C22");
        map.put("term",3);
        callMapper.callFunction(map);
        return map;
    }

    @ResponseBody
    @RequestMapping("findallsclist")
    public List findallsclist(){
        return scMapper.findallsclist();
    }

    @RequestMapping("/insertsc")
    public String insertsc(HttpSession session, String cno, int term, Model model){
        String sno= (String) session.getAttribute("username");
        sc sc=new sc(sno,cno,0,term);
        System.out.println(sno+" "+cno+" "+term);
        String resinfo="";
        List<sc> list=scMapper.findallsclist();
        boolean falg=false;
        Map map=new HashMap();
        map.put("sno",sno);
        map.put("cno",cno);
        map.put("term",term);
        callMapper.callFunction(map);
        System.out.println(map.get("p3")+"--------------");

        if ("0".equals(map.get("p3").toString())){
            model.addAttribute("resinfo","本学期选课不能超出19分");
            resinfo=new String("本学期选课不能超出19分");
            return "index";
        }

        for (int i = 0; i <list.size() ; i++) {
            if (sno.equals(list.get(i).getSno())&&cno.equals(list.get(i).getCno())&&list.get(i).getTerm()==term){
                falg=true;break;}
        }

        if (!falg){
            resinfo=new String("选课成功");
            scMapper.insertscinfo(sc);
        }
        else{
            resinfo=new String("同一学期，不能选相同的课程");
        }
        model.addAttribute("resinfo",resinfo);
        return "index";
    }

    @ResponseBody
    @RequestMapping("iscontains0")
    public int inscontains(){
        sc sc=new sc("011","C18",0,1);
        return scMapper.iscontains(sc);
    }






}
