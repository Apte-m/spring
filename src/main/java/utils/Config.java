package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Data
public class Config extends Token {
    @Value("${url}")
    private String url;


    public RequestSpecification requestSpec() {
        return new RequestSpecBuilder()
                .setRelaxedHTTPSValidation()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
//                .addFilter(new AllureRestAssured())
//                .addFilter(new ResponseLoggingFilter())
//                .addFilter(new RequestLoggingFilter())
                .build();
    }


    public ResponseSpecification responseSpec(int status) {
        return new ResponseSpecBuilder()
                .build();
    }


    public void installSpecification(RequestSpecification requestSpec, ResponseSpecification responseSpec) {
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = responseSpec;
    }


    public void installSpecification(RequestSpecification requestSpec) {
        RestAssured.requestSpecification = requestSpec;
    }


    public void installSpecification(ResponseSpecification responseSpec) {
        RestAssured.responseSpecification = responseSpec;
    }


}
