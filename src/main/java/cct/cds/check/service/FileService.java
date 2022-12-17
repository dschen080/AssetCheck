package cct.cds.check.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    String importassets(MultipartFile file,String unitcode);
}
