package cn.xsaf1207.sys.controller;

import cn.xsaf1207.sys.domain.User;
import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import cn.xsaf1207.utils.ConstantData;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/alluser")
    public ResultData alluser(){
        List<UserVo> uservoList = userService.queryAllUser();
        ResultData resultData = new ResultData();
        try{
            if (uservoList != null){
                //成功 添加ResultData里的常量code 并赋值为0；
                resultData.setCode(ConstantData.SUCCESS_CODE);
                //添加ResultData里的常量data
                resultData.setData(uservoList);
                return resultData;
            }
            //添加ResultData里的常量code 并赋值为-1
            resultData.setData(ConstantData.FAIL_CODE);
            return resultData;
        }
        catch (Exception e){
            e.printStackTrace();
            //添加ResultData里的常量code 并赋值为-10
            resultData.setCode(ConstantData.EXCEPTION_CODE);
            return resultData;
        }
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
        ResultData deleteData = new ResultData();
        try{
            if(userService.deleteUser(userVo) == 1){
                deleteData.setCode(ConstantData.SUCCESS_CODE);
                return deleteData;
            }
            deleteData.setCode(ConstantData.FAIL_CODE);
            return deleteData;
        }
        catch(Exception e){
            e.printStackTrace();
            deleteData.setCode(ConstantData.EXCEPTION_CODE);
            return deleteData;
        }

    }
}
