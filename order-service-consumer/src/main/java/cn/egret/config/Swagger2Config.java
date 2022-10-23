package cn.egret.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置信息
 * @author egret
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * 规定扫描那些地方作为接口文档
     * @return
     */
    @Bean
    public Docket createRestApi() {

        // 文档类型DocumentationType.SWAGGER_2
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.egret.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")
                .description("接口文档")
                .contact(new Contact("egret", "http://localhost:8082/doc.html", "1448952248@qq.com.com"))
                .version("1.0")
                .build();
    }
}
