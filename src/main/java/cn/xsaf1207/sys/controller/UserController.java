package cn.xsaf1207.sys.controller;

import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import cn.xsaf1207.utils.ConstantData;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/alluser")
    public ResultData alluser(){
        return null;
    }

    @RequestMapping(value = "/updateuser",method = RequestMethod.PUT)
    public ResultData updateuser(UserVo userVo){
        return null;
    }

    @RequestMapping(value = "/resetpas",method = RequestMethod.PUT)
    public ResultData resetpas(UserVo userVo){
        ResultData resultData = new ResultData();
        try{
            if(userService.resetPas(userVo) == 1){
                resultData.setCode(ConstantData.SUCCESS_CODE);
                return resultData;
            }
            resultData.setCode(ConstantData.FAIL_CODE);
            return resultData;
        }
        catch(Exception e){
            e.printStackTrace();
            resultData.setCode(ConstantData.EXCEPTION_CODE);
            return resultData;
        }
    }

    @RequestMapping(value = "/deleteuser",method = RequestMethod.DELETE)
    public ResultData deleteuser(UserVo userVo){
        return null;
    }
}
