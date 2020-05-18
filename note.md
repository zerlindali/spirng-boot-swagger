### issue
1. 报错：Parameter 0 of method linkDiscoverers in org.springframework.hateoas.config.HateoasConfiguration req   
解决方法：springboot和swagger版本不匹配(这个问题的解决办法就是直接将pom文件中的swagger版本换成2.9.2就可以了)

2. 访问http://localhost:8080/swagger-ui.html时浏览器弹窗
Unable to infer base url. This is common when using dynamic servlet registration or when the API is behind an API Gateway. 
The base url is the root of where all the swagger resources are served. 
For e.g. if the api is available at http://example.org/api/v2/api-docs then the base url is http://example.org/api/. 
Please enter the location manually:    
解决方法: 用f12看被拦截的路径，加入WebMvcConfiguration中,在Application类上加注解@EnableSwagger2
这里有一个要注意的地方，当我们使用swagger-ui原生的ui的时候，要放开权限校验的地址是/swagger-ui.html/swagger-resources/**
当我们使用swagger-bootstrap-ui时，要放开权限校验的地址是/swagger-resources/**和/doc.html

3. 引入了spring-boot-starter-security包之后，访问接口需要登录。Spring Boot项目只要引用了如下依赖，默认就启动安全配置   
解决方案：默认用户名是user, 密码是程序启动时自动生成的一串字符串