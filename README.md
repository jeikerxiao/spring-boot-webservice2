# spring-boot-webservice2
spring-boot-webservice2


## 测试

请求地址：

http://localhost:8090/test/user?wsdl

### 获取用户名

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://service.jeiker.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getName>
      	<userId>411001</userId>
      </gs:getName>
   </soapenv:Body>
</soapenv:Envelope>

```


响应：

```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <ns2:getNameResponse xmlns:ns2="http://service.jeiker.com/">
            <return>liyd-411001</return>
        </ns2:getNameResponse>
    </soap:Body>
</soap:Envelope>
```


### 获取用户

请求:

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://service.jeiker.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getUser>
      	<arg0>411001</arg0>
      </gs:getUser>
   </soapenv:Body>
</soapenv:Envelope>
```


响应：

```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <ns2:getUserResponse xmlns:ns2="http://service.jeiker.com/">
            <return>
                <age>20</age>
                <updateTime>2018-07-10T21:27:02.811+08:00</updateTime>
                <userId>411001</userId>
                <username>zhansan</username>
            </return>
        </ns2:getUserResponse>
    </soap:Body>
</soap:Envelope>

```


