package cct.cds.check.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("cct.cds.check.mbg.mapper")
public class MyBatisConfig {
}
