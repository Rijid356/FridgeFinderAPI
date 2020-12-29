import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Slf4j
@Configuration
@EnableSwagger2
@PropertySource(value = "classpath:/git.propertires", ignoreResourceNotFound = true)
public class SwaggerConfig {

    @Value("${git.build.version:0.0.0}")
    private String version;
    @Value("${server.servlet.context-path}")
    private String basePath;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.FridgeFinder.rest"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(Collections.singletonList(apiKey()))
                //.securityContexts(Collections.singletonList(securityContext()))
                .apiInfo(apiInfo());
    }

    private ApiKey apiKey() {
        return new ApiKey("apiKey", "Authorization", "header");
    }

    /*@Bean
    public SecurityConfiguration securityInfo() {
        return new SecurityConfiguration(CLIENT_ID, CLIENT_SECRET, "realm", CLIENT_ID, "apiKey", ApiKeyVehicle.HEADER, "Authorization", "");
    }*/

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Fridge Finder REST API",
                "Find what's in your fridge",
                version,
                "",
                new Contact("Ryan Donnelly", basePath, "rijid356@gmail.com"),
                "License",
                "License URL",
                Collections.emptyList());
    }
}
