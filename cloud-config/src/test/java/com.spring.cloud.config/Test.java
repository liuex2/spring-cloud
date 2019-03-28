package com.spring.cloud.config;

/**
 * 测试用例
 */
public class Test {

    /**
     * 浏览器端访问：http://localhost:8888/config-client/dev/master 显示如下：
     *
     * <Environment>
     *   <name>config-client</name>
     *   <profiles>
     *     <profiles>dev</profiles>
     *   </profiles>
     *   <label>master</label>
     *   <version>9646007f931753d7e96a6dcc9ae34838897a91df</version>
     *   <state/>
     *   <propertySources>
     *     <propertySources>
     *       <name>https://github.com/topsale/spring-cloud-config/respo/config-client-dev.yml</name>
     *       <source>
     *         <foo>foo version 1</foo>
     *         <demo.message>Hello Spring Config</demo.message>
     *       </source>
     *     </propertySources>
     *   </propertySources>
     * </Environment>
     */
    public void test1(){}
}
