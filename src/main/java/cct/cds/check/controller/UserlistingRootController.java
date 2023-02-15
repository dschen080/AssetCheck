package cct.cds.check.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cct.cds.check.common.api.CommonPage;
import cct.cds.check.common.api.CommonResult;
import cct.cds.check.dto.UserInfoParam2;
import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.service.UserlistingRootService;

@Api(tags = "UserlistingRootController", description = "员工管理(超级管理员)")
@Controller
@RequestMapping("/userlistingRoot")
public class UserlistingRootController {
    
    @Autowired
    private UserlistingRootService userlistingRootService;

    @ApiOperation(value = "获取单位资产管理员列表")
    @RequestMapping(value = "/select/{orgId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Userlisting>> list(@PathVariable String orgId,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<Userlisting> list = userlistingRootService.list(orgId,pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取资产负责人列表")
    @RequestMapping(value = "/select5", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Userlisting>> list(
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "orgid", defaultValue = "") String orgid,
                                                     @RequestParam(value = "sectname", defaultValue = "") String sectname){
        List<Userlisting> list = userlistingRootService.list2(orgid,sectname,pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "添加单位资产管理员")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody UserInfoParam2 userInfoParam){
        Boolean bool = userlistingRootService.create(userInfoParam);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "修改单位资产管理员")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody UserInfoParam2 userInfoParam){
        Boolean bool = userlistingRootService.update(userInfoParam);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "添加单位资产管理员")
    @RequestMapping(value = "/create3", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create3(@RequestBody UserInfoParam2 userInfoParam){
        Boolean bool = userlistingRootService.create3(userInfoParam);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "修改单位资产管理员")
    @RequestMapping(value = "/update3", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update3(@RequestBody UserInfoParam2 userInfoParam){
        Boolean bool = userlistingRootService.update3(userInfoParam);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "添加单位资产管理员")
    @RequestMapping(value = "/create5", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create5(@RequestBody UserInfoParam2 userInfoParam){
        Boolean bool = userlistingRootService.create5(userInfoParam);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "修改单位资产管理员")
    @RequestMapping(value = "/update5", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update5(@RequestBody UserInfoParam2 userInfoParam){
        Boolean bool = userlistingRootService.update5(userInfoParam);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "删除单位资产管理员")
    @RequestMapping(value = "/delete/{username}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable String username){
        Boolean bool = userlistingRootService.delete(username);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }


}
