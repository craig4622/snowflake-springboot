# snowflake-springboot
推特雪花iD算法封装的springboot的组件


springboot使用该组件步骤,通过该项目git地址clone项目,通过IDEA的clean和install命令打包到本地maven中,在自己的springboot项目的pom.xml中引入snowflake-springboot项目的,例如
<!--自定义推特雪花id生成的springboot封装组件-->
        <dependency>
            <groupId>com.xsq</groupId>
            <artifactId>snowflake-springboot</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>  
        在自己的springboot项目的application.properties文件中设置推特雪花组件需要的两个参数值例如:
        com.snowflake.worker-id=1
        com.snowflake.data-center-id=3
        ,如果不清楚雪花组件可以百度推特雪花组件,然后就可以直接在你的java代码中用了,通过 
     @Autowired
    private SnowflakeIdUtil snowflakeIdUtil;
    在你的代码中直接调用snowflakeIdUtil.nextId()就可以获得雪花组件生成的id,这就是完整的步骤 是不是很简单
        
