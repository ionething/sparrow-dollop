package com.github.ionething.sparrow.dollop;

import com.github.ionething.sparrow.dollop.common.util.SpringContextUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Vincent
 */
@SpringBootApplication
public class DollopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DollopApplication.class, args);
    }

}
