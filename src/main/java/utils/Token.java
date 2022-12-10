package utils;

import org.springframework.beans.factory.annotation.Value;


public class Token {
    @Value("${token}")
    private String token;

    public String getToken() {
        return token;
    }
}
