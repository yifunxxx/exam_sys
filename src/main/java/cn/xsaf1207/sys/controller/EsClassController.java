package cn.xsaf1207.sys.controller;

import cn.xsaf1207.sys.domain.EsClass;
import cn.xsaf1207.sys.service.EsClassService;
import cn.xsaf1207.sys.vo.UserVo;
import cn.xsaf1207.utils.ConstantData;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EsClassController {
    @Autowired
    private EsClassService esClassService;

    @GetMapping("/allclass")
    public ResultData allclass(){
        List<EsClass> esClassList = esClassService.queryAllClass();
        ResultData resultData = new ResultData();
        try{
            if (esClassList != null){
                //成功 添加ResultData里的常量code 并赋值为0；
                resultData.setCode(ConstantData.SUCCESS_CODE);
                //添加ResultData里的常量data
                resultData.setData(esClassList);
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
