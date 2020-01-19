package com.xsq.util;

/**
 * @ClassName SnowflakeIdUtil
 * @Description TODO 雪花使用工具类
 * @Author xsq
 * @Date 2020/1/17 17:41
 **/
public class SnowflakeIdUtil {

    private SnowflakeIdWorker snowflakeIdWorker;

    public SnowflakeIdUtil() {
    }

    public SnowflakeIdUtil(long workerId, long dataCenterId) {
        snowflakeIdWorker = new SnowflakeIdWorker(workerId, dataCenterId);
    }

    public long nextId() {
        return snowflakeIdWorker.nextId();
    }
}
