package cn.xsaf1207.sys.controller;

import javax.servlet.http.HttpSession;

import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import cn.xsaf1207.utils.ConstantData;
import cn.xsaf1207.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 用户登陆控制器
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private UserService userService;
	/**
	 * 登陆方法
	 */
	@PostMapping("/login")
	public ResultData login(@RequestBody UserVo userVo, HttpSession session) {
		ResultData resultData = new ResultData();
		try{
			UserVo userVo1 = userService.login(userVo);
			if(null!=userVo1) {
				//放到session
				session.setAttribute("userVo", userVo1);
				resultData.setCode(ConstantData.SUCCESS_CODE);
				resultData.setData(userVo1);
				return resultData;
			}
			resultData.setCode(ConstantData.FAIL_CODE);
			return resultData;
		}
		catch(Exception e){
			resultData.setCode(ConstantData.EXCEPTION_CODE);
			return resultData;
		}
	}
	/**
	 * 检查登录态
	 */
	@GetMapping("/checkin")
	public ResultData checkin(HttpSession session){
		ResultData resultData = new ResultData();
		UserVo userVo = (UserVo) session.getAttribute("userVo");
		System.out.println(userVo);
		if(null != userVo){
			resultData.setCode(ConstantData.SUCCESS_CODE);
			return resultData;
		}
		resultData.setCode(ConstantData.FAIL_CODE);
		return resultData;
	}
}
