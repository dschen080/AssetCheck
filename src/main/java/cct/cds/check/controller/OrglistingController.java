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
import cct.cds.check.mbg.model.Orglisting;
import cct.cds.check.service.OrglistingService;

@Api(tags = "UserlistingController", description = "员工管理")
@Controller
@RequestMapping("/orglisting")
public class OrglistingController {
    
    @Autowired
    private OrglistingService orglistingService;

    @ApiOperation(value = "获取资产单位列表")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Orglisting>> list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<Orglisting> list = orglistingService.list(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "添加资产单位")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody Orglisting orglisting){
        Boolean bool = orglistingService.create(orglisting);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "修改资产单位")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody Orglisting orglisting){
        Boolean bool = orglistingService.update(orglisting);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "删除资产单位")
    @RequestMapping(value = "/delete/{orgId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable String orgId){
        Boolean bool = orglistingService.delete(orgId);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }


}
