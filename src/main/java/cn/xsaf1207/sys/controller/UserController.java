package cn.xsaf1207.sys.controller;

import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/alluser")
    public ResultData alluser(){
        return null;
    }

    @RequestMapping("/updateuser")
    public ResultData updateuser(){
        return null;
    }

    @RequestMapping("/resetpas")
    public ResultData resetpas(){
        return null;
    }

    @RequestMapping("/deleteuser")
    public ResultData deleteuser(){
        return null;
    }
}
