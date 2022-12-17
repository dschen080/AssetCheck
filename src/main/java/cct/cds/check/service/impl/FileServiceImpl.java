package cct.cds.check.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cct.cds.check.mbg.mapper.AssetrecMapper;
import cct.cds.check.mbg.mapper.UserlistingMapper;
import cct.cds.check.mbg.model.Assetrec;
import cct.cds.check.mbg.model.AssetrecExample;
import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.mbg.model.UserlistingExample;
import cct.cds.check.service.FileService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private AssetrecMapper assetrecMapper;

    @Autowired
    private UserlistingMapper userlistingMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;  

    @Override
    public String importassets(MultipartFile multipartFile,String orgid){

        // 获取文件名，包含后缀
        //文件上传前的名称
        String fileName = multipartFile.getOriginalFilename();
        File file = new File(fileName);
        OutputStream out = null;
        try{
            //获取文件流，以文件流的方式输出到新文件
        //    InputStream in = multipartFile.getInputStream();
            out = new FileOutputStream(file);
            byte[] ss = multipartFile.getBytes();
            for(int i = 0; i < ss.length; i++){
                out.write(ss[i]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try{
            InputStream is = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheetAt(0);
            workbook.close();
            Row titleRow = sheet.getRow(0);
            //对每一行进行处理
            for (int i = 1;i < sheet.getLastRowNum() + 1; i++){
                Row row = sheet.getRow(i);
                Assetrec assetrec = new Assetrec();
                assetrec.setOrgid(orgid);
                XSSFCell cell1 = (XSSFCell) row.getCell(1);
                cell1.setCellType(CellType.STRING);
                assetrec.setAssetcode(cell1.getStringCellValue());
                XSSFCell cell2 = (XSSFCell) row.getCell(2);
                cell2.setCellType(CellType.STRING);
                assetrec.setAssetname(cell2.getStringCellValue());
                XSSFCell cell3 = (XSSFCell) row.getCell(3);
                cell3.setCellType(CellType.STRING);
                assetrec.setCode4gs1(cell3.getStringCellValue());
                XSSFCell cell4 = (XSSFCell) row.getCell(4);
                cell4.setCellType(CellType.STRING);
                assetrec.setAssetprice(cell4.getStringCellValue());
                XSSFCell cell5 = (XSSFCell) row.getCell(5);
                cell5.setCellType(CellType.STRING);
                assetrec.setTakedate(cell5.getStringCellValue());
                XSSFCell cell6 = (XSSFCell) row.getCell(6);
                cell6.setCellType(CellType.STRING);
                assetrec.setAmount((byte)Integer.parseInt(cell6.getStringCellValue()));
                XSSFCell cell7 = (XSSFCell) row.getCell(7);
                cell7.setCellType(CellType.STRING);
                assetrec.setMeasure(cell7.getStringCellValue());
                XSSFCell cell8 = (XSSFCell) row.getCell(8);
                cell8.setCellType(CellType.STRING);
                assetrec.setAccdepre(cell8.getStringCellValue());
                XSSFCell cell9 = (XSSFCell) row.getCell(9);
                cell9.setCellType(CellType.STRING);
                assetrec.setStoreloc(cell9.getStringCellValue());
                XSSFCell cell10 = (XSSFCell) row.getCell(10);
                cell10.setCellType(CellType.STRING);
                assetrec.setBrand(cell10.getStringCellValue());
                XSSFCell cell11 = (XSSFCell) row.getCell(11);
                cell11.setCellType(CellType.STRING);
                assetrec.setSpecifics(cell11.getStringCellValue());
                XSSFCell cell12 = (XSSFCell) row.getCell(12);
                cell12.setCellType(CellType.STRING);
                assetrec.setAccdocno(cell12.getStringCellValue());
                XSSFCell cell13 = (XSSFCell) row.getCell(13);
                cell13.setCellType(CellType.STRING);
                assetrec.setNotes(cell13.getStringCellValue());
                XSSFCell cell14 = (XSSFCell) row.getCell(14);
                cell14.setCellType(CellType.STRING);
                assetrec.setAssetuser(cell14.getStringCellValue());
                XSSFCell cell15 = (XSSFCell) row.getCell(15);
                cell15.setCellType(CellType.STRING);
                assetrec.setAssetdept(cell15.getStringCellValue());
                XSSFCell cell16 = (XSSFCell) row.getCell(16);
                cell16.setCellType(CellType.STRING);
                assetrec.setAssetclass(cell16.getStringCellValue());
                XSSFCell cell17 = (XSSFCell) row.getCell(17);
                cell17.setCellType(CellType.STRING);
                assetrec.setAssetgbclass(cell17.getStringCellValue());
                XSSFCell cell18 = (XSSFCell) row.getCell(18);
                cell18.setCellType(CellType.STRING);
                assetrec.setUsetype(cell18.getStringCellValue());
                XSSFCell cell19 = (XSSFCell) row.getCell(19);
                cell19.setCellType(CellType.STRING);
                assetrec.setUsestate(cell19.getStringCellValue());
                XSSFCell cell21 = (XSSFCell) row.getCell(21);
                cell21.setCellType(CellType.STRING);
                assetrec.setAssetclasscode(cell21.getStringCellValue());
                XSSFCell cell22 = (XSSFCell) row.getCell(22);
                cell22.setCellType(CellType.STRING);
                assetrec.setTakemode(cell22.getStringCellValue());
                XSSFCell cell23 = (XSSFCell) row.getCell(23);
                cell23.setCellType(CellType.STRING);
                assetrec.setWorkloc(cell23.getStringCellValue());
                XSSFCell cell24 = (XSSFCell) row.getCell(24);
                cell24.setCellType(CellType.STRING);
                assetrec.setAccdepremonth(Integer.parseInt(cell24.getStringCellValue()));
                XSSFCell cell25 = (XSSFCell) row.getCell(25);
                cell25.setCellType(CellType.STRING);
                assetrec.setFirstusedate(cell25.getStringCellValue());
                XSSFCell cell26 = (XSSFCell) row.getCell(26);
                cell26.setCellType(CellType.STRING);
                assetrec.setBillingdate(cell26.getStringCellValue());
                XSSFCell cell27 = (XSSFCell) row.getCell(27);
                cell27.setCellType(CellType.STRING);
                assetrec.setFundingsrc(cell27.getStringCellValue());

                AssetrecExample example = new AssetrecExample();
                example.createCriteria().andOrgidEqualTo(orgid).andAssetcodeEqualTo(assetrec.getAssetcode());
                if(assetrecMapper.selectByExample(example).size()==0){
                    assetrecMapper.insert(assetrec);
                }

                //创建默认用户
                Userlisting userlisting = new Userlisting();
                userlisting.setOrgid(assetrec.getOrgid());
                userlisting.setUsername4unit(assetrec.getAssetuser());
                if(userlisting.getUsername4unit().length()>0){
                    UserlistingExample uexample = new UserlistingExample();
                    uexample.createCriteria().andOrgidEqualTo(userlisting.getOrgid()).andUsername4unitEqualTo(userlisting.getUsername4unit());
                    if(userlistingMapper.selectByExample(uexample).size()>0){
                        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
                        userlisting.setSectname(assetrec.getAssetdept());
                        userlisting.setPasswd(passwordEncoder.encode("123456"));
                        userlisting.setUsertype((byte)5);
                        userlisting.setCreatetime(new Date());
                        userlisting.setNotes("批量导入时创建");
                        userlistingMapper.insert(userlisting);
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
            //删除临时文件
        file.delete();
        return "更新完成";
        
    }
    
}
