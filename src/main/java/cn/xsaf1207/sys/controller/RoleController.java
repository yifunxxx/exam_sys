package cn.xsaf1207.sys.controller;

import cn.xsaf1207.sys.service.RoleService;
import cn.xsaf1207.sys.vo.RoleVo;
import cn.xsaf1207.sys.vo.UserVo;
import cn.xsaf1207.utils.ConstantData;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/allrole")
    public ResultData allrole(@RequestBody UserVo userVo){
        List<RoleVo> roleVos = roleService.queryAllRole(userVo);
        ResultData resultData = new ResultData();
        try{
            if (roleVos != null){
                //成功 添加ResultData里的常量code 并赋值为0；
                resultData.setCode(ConstantData.SUCCESS_CODE);
                //添加ResultData里的常量data
                resultData.setData(roleVos);
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
}
