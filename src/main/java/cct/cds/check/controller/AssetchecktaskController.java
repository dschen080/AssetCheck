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
import cct.cds.check.dto.Assetchecktask4android;
import cct.cds.check.dto.AssetchecktaskParam;
import cct.cds.check.dto.AssetchecktaskStatisticsParam;
import cct.cds.check.mbg.model.Assetchecktask;
import cct.cds.check.service.AssetchecktaskService;

@Api(tags = "AssetTaskController", description = "盘点任务管理")
@Controller
@RequestMapping("/assetchecktask")
public class AssetchecktaskController {
    
    @Autowired
    private AssetchecktaskService assetchecktaskService;

    @ApiOperation(value = "添加资产盘点任务")
    @RequestMapping(value = "/create/{keyword}/{assetdept}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody AssetchecktaskParam assetchecktaskParam,@PathVariable String keyword,@PathVariable String assetdept){
        Boolean bool = assetchecktaskService.create(assetchecktaskParam,keyword,assetdept);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "查询资产盘点任务")
    @RequestMapping(value = "/select/{orgId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<AssetchecktaskStatisticsParam>> list(@PathVariable String orgId,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<AssetchecktaskStatisticsParam> list = assetchecktaskService.list(orgId,pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "删除资产盘点任务")
    @RequestMapping(value = "/delete/{taskid}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable int taskid){
        Boolean bool = assetchecktaskService.delete(taskid);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "查询资产盘点任务(安卓)")
    @RequestMapping(value = "/select4android/{orgId}/{username4unit}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult list4android(@PathVariable String orgId,@PathVariable String username4unit){
        List<Assetchecktask4android> list = assetchecktaskService.list4android(orgId,username4unit);
        return CommonResult.success(list);
    }
}
