package pl.com.sk.newspot.newsclient;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "pl.com.sk.newspot.newsclient")
@Configuration
public class NewsFeignConfig {
    @Value("${news.api.key}")
    private String apiKey;

    @Bean
    public RequestInterceptor newsAuthorizationInterceptor(){
        return template -> template.header("x-api-key", apiKey);
    }
}
