package com.xsq.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName SnowflakeProperties
 * @Description TODO
 * @Author xsq
 * @Date 2020/1/19 9:46
 **/
@Data
@ConfigurationProperties(prefix = "com.snowflake")
public class SnowflakeProperties {


    private long  workerId;


    private long dataCenterId;

}
