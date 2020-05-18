package org.lic.swagger.autoconfigure;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author ZerlindaLi create at 2020/5/13 18:33
 * @version 1.0.0
 * @description MySwaggerProperties
 */
@Data
@ConfigurationProperties(prefix = "my.cloud.swagger2")
public class MySwaggerProperties {

    /**
     * 是否启用swagger，生产环境建议关闭
     */
    private boolean enabled;
    /**
     * 文档标题
     */
    private String title;

    /**
     * 文档描述
     */
    private String description;

    /**
     * 客户端ID
     */
    private String clientId;

    /**
     * 客户端密钥
     */
    private String clientSecret;

    /**
     * 客户端授权范围
     */
    private String scope;

    /**
     * 获取token
     */
    private String accessTokenUri;

    /**
     * 认证地址
     */
    private String userAuthorizationUri;

    /**
     * 邮箱地址
     */
    private String email;

    private List<String> ignores = Lists.newArrayList();
}
