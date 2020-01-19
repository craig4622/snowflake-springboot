package com.xsq.config;

import com.xsq.util.SnowflakeIdUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SnowflakeAutoConfigure
 * @Description TODO
 * @Author xsq
 * @Date 2020/1/19 10:10
 **/
@Configuration
@ConditionalOnClass(SnowflakeIdUtil.class)
@EnableConfigurationProperties(SnowflakeProperties.class)
public class SnowflakeAutoConfigure {

    @Bean
    public SnowflakeIdUtil getSnowflakeIdUtil(SnowflakeProperties snowflakeProperties) {
        return new SnowflakeIdUtil(snowflakeProperties.getWorkerId(), snowflakeProperties.getDataCenterId());
    }
}
