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

import cct.cds.check.service.AssetcheckhisService;

import cct.cds.check.common.api.CommonPage;
import cct.cds.check.common.api.CommonResult;
import cct.cds.check.dto.AssetcheckhisParam;
import cct.cds.check.mbg.model.Assetcheckhis;


@Api(tags = "AssetcheckhisController", description = "盘点历史管理")
@Controller
@RequestMapping("/assetcheckhis")
public class AssetcheckhisController {
    
    @Autowired
    private AssetcheckhisService assetcheckhisService;

    @ApiOperation(value = "查询历史盘点任务")
    @RequestMapping(value = "/select/{taskid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<AssetcheckhisParam>> list(@PathVariable Integer taskid,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<AssetcheckhisParam> list = assetcheckhisService.list(taskid,pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "查询历史盘点任务5")
    @RequestMapping(value = "/select5", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<AssetcheckhisParam>> list(
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<AssetcheckhisParam> list = assetcheckhisService.list2(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "删除历史盘点任务")
    @RequestMapping(value = "/delete/{assetchkid}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable int assetchkid){
        Boolean bool = assetcheckhisService.delete(assetchkid);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }
}
