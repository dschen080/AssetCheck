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
import cct.cds.check.mbg.model.Assetrec;
import cct.cds.check.service.AssetrecService;

@Api(tags = "AssetRecController", description = "资产管理")
@Controller
@RequestMapping("/assetrec")
public class AssetrecController {
    
    @Autowired
    private AssetrecService assetrecService;

    @ApiOperation(value = "获取资产列表")
    @RequestMapping(value = "/select/"+"{orgid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Assetrec>> list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "keyword", defaultValue = "null") String keyword,
                                                     @PathVariable String orgid){
        List<Assetrec> list = assetrecService.list(pageSize, pageNum,keyword,orgid);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取资产列表")
    @RequestMapping(value = "/select/"+"{orgid}/{depart}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Assetrec>> departlist(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "keyword", defaultValue = "null") String keyword,
                                                     @PathVariable String orgid,
                                                     @PathVariable String depart){
        List<Assetrec> list = assetrecService.departlist(pageSize, pageNum,keyword,orgid,depart);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "添加资产")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody Assetrec assetrec){
        Boolean bool = assetrecService.create(assetrec);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "修改资产")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody Assetrec assetrec){
        Boolean bool = assetrecService.update(assetrec);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "删除资产单位")
    @RequestMapping(value = "/delete/{assetid}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable int assetid){
        Boolean bool = assetrecService.delete(assetid);
        if(bool){
            return CommonResult.success(bool);
        }
        return CommonResult.failed();
    }
}
