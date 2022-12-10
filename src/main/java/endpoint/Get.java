package endpoint;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import utils.Config;

import static io.restassured.RestAssured.given;


@Configuration
public class Get {


    @ConditionalOnMissingBean(Config.class)
    @Bean
    public Config customComponent() {
        return new Config();
    }


    public void exampleTest() {
        customComponent().installSpecification(customComponent().requestSpec(), customComponent().responseSpec(200));
        model.Postman postmanTest = given().get().as(model.Postman.class);
        System.out.println(postmanTest);
        System.out.println(postmanTest.url());
        System.out.println(customComponent().getToken());
    }
}
