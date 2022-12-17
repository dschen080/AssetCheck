package cct.cds.check.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cct.cds.check.common.api.CommonResult;
import cct.cds.check.service.FileService;

@Api(tags = "FileController", description = "文件管理")
@Controller
@RequestMapping("/upload")
public class FileController {

    @Autowired
    private FileService fileService;

    @ApiOperation(value = "批量导入用户")
    @RequestMapping(value = "/excel", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult importusers(@RequestParam MultipartFile file, @RequestParam String orgid){
        String info = fileService.importassets(file,orgid);
        return CommonResult.success(info);
    }
}
