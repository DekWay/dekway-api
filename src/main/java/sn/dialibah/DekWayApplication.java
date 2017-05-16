package sn.dialibah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"sn.dialibah.localisation", "sn.dialibah.user", "sn.dialibah.common"})
public class DekWayApplication {

    public static void main(final String[] args) {
        SpringApplication.run(DekWayApplication.class, args);
    }
}
