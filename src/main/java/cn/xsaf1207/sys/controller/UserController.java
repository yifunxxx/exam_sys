package cn.xsaf1207.sys.controller;

import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import cn.xsaf1207.utils.ConstantData;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return
     */
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

    /**
     * 更新用户信息
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/updateuser",method = RequestMethod.PUT)
    public ResultData updateuser(@RequestBody UserVo userVo){
        ResultData resultData = new ResultData();
        try{
            if(userService.updateUser(userVo) == 1){
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

    /**
     * 重置用户密码
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/resetpas",method = RequestMethod.PUT)
    public ResultData resetpas(@RequestBody UserVo userVo){
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
    /**
     * 删除用户
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/deleteuser",method = RequestMethod.DELETE)
    public ResultData deleteuser(@RequestBody UserVo userVo){
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
    /**
     * 新增用户
     */
    @PostMapping("/adduser")
    public ResultData adduser(@RequestBody UserVo userVo){
        ResultData resultData = new ResultData();
        try{
            if(userService.addUser(userVo) == 1){
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

    /**
     * 分配用户
     * @param userVo
     * @return
     */
    @PostMapping("/distrole")
    public ResultData distrole(@RequestBody UserVo userVo){
        ResultData resultData = new ResultData();
        try{
            if(userService.distrole(userVo) == 1){
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

    @GetMapping("/getuser")
    public ResultData getuser(UserVo userVo){
        List<UserVo> userVos = userService.getuser(userVo);
        ResultData resultData = new ResultData();
        try{
                resultData.setData(userVos);
                resultData.setCode(ConstantData.SUCCESS_CODE);
                return resultData;
        }
        catch(Exception e){
            e.printStackTrace();
            resultData.setCode(ConstantData.EXCEPTION_CODE);
            return resultData;
        }
    }

    /**
     * 更新用户密码
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/updatepwd",method = RequestMethod.PUT)
    public ResultData updatepwd(@RequestBody UserVo userVo){
        ResultData resultData = new ResultData();
        try{
            if(userService.updatePwd(userVo) == 1){
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

}
