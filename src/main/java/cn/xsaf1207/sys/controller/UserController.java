package cn.xsaf1207.sys.controller;

import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/alluser")
    public ResultData alluser(){
        return null;
    }

    @RequestMapping(value = "/updateuser",method = RequestMethod.PUT)
    public ResultData updateuser(){
        return null;
    }

    @RequestMapping(value = "/resetpas",method = RequestMethod.PUT)
    public ResultData resetpas(){
        return null;
    }

    @RequestMapping(value = "/deleteuser",method = RequestMethod.DELETE)
    public ResultData deleteuser(){
        return null;
    }
}
