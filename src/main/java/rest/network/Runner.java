package rest.network;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class Runner {
    public static final String RESOURCES_ROOT = "src/main/resources";
    public static final String ATTACHMENTS = RESOURCES_ROOT + "/attachments";

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
        log.info("Application started");
    }

}
