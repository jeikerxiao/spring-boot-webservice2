package com.jeiker.service;

import com.jeiker.dto.User;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
public class UserServiceTest {
    @Test
    public void getName() throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8090/test/user?wsdl");
        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
        Object[] objects = client.invoke("getName", "411001");
        //输出调用结果
        System.out.println("*****" + objects[0].toString());
    }

    @Test
    public void getUser() throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8090/test/user?wsdl");
        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
        Object[] objects = client.invoke("getUser", "411001");
        //输出调用结果
        System.out.println("*****" + objects[0].toString());
    }

}