package cct.cds.check.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cct.cds.check.common.api.CommonResult;
import cct.cds.check.dto.LoginParam;
import cct.cds.check.dto.UserInfo4Android;
import cct.cds.check.dto.UserInfoParam;
import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.service.UserlistingService;

@Api(tags = "UserlistingController", description = "员工管理")
@Controller
@RequestMapping("/userlisting")
public class UserlistingController {

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private UserlistingService userlistingService;

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@Validated @RequestBody LoginParam loginParam){
        String token = userlistingService.login(loginParam.getUsername(), loginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "登出")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult logout(){
        return CommonResult.success(null);
    }

    @ApiOperation(value = "修改账号基本信息")
    @RequestMapping(value = "/updateAccountInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateAccountInfo(@Validated @RequestBody UserInfoParam userInfoParam){
        boolean bool = userlistingService.updateAccountInfo(userInfoParam);
        return CommonResult.success(bool);

    }

    @ApiOperation(value = "修改账号密码")
    @RequestMapping(value = "/updateAccountPassword", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateAccountPassword(@Validated @RequestBody LoginParam loginParam){
        boolean bool = userlistingService.updateAccountPassword(loginParam.getUsername(),loginParam.getPassword());
        return CommonResult.success(bool);

    }

    @ApiOperation(value = "删除账号")
    @RequestMapping(value = "/deleteAccount", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteAccount(@Validated @RequestBody String username){ //不知道有没有问题
        boolean bool = userlistingService.deleteAccount(username);
        return CommonResult.success(bool);

    }

    @ApiOperation(value = "注册账号")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@Validated @RequestBody Userlisting userlisting){ //不知道有没有问题
        boolean bool = userlistingService.register(userlisting);
        return CommonResult.success(bool);

    }


    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAdminInfo(Principal principal){
        if(principal==null){
            return CommonResult.unauthorized(null);
        }
        String username = principal.getName();
        Userlisting userlisting = userlistingService.getUserlistByUsername(username);
        Map<String, Object> data = new HashMap<>();
        data.put("realname", userlisting.getRealname());
        data.put("username",userlisting.getUsername());
        data.put("roles",userlisting.getUsertype()); //返回权限类型 1 3 
        data.put("orgid",userlisting.getOrgid());
        data.put("sectname",userlisting.getSectname());
        data.put("username4unit",userlisting.getUsername4unit());
        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取单位名称")
    @RequestMapping(value = "/name/{orgid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOrgname(@PathVariable String orgid){
        String orgname = userlistingService.getOrgname(orgid);
        if(orgname!=null){
            return CommonResult.success(orgname);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "获取用户信息")
    @RequestMapping(value = "/androidinfo/{orgid}/{username4unit}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAndroidUserInfo(@PathVariable String orgid,@PathVariable String username4unit){
        UserInfo4Android info = userlistingService.getAndroidUserInfo(orgid,username4unit);
        if(info!=null){
            return CommonResult.success(info);
        }
        return CommonResult.failed();
    }

}
