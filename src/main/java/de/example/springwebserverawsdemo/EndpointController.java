package de.example.springwebserverawsdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController("/")
@Slf4j
public class EndpointController {

    @GetMapping("/api")
    public String getName(){
        log.info("called api endpoint");
        return "My name is Fiete 2";
    }

    @GetMapping("api/time")
    public String getCurrentTime(){
        return LocalDateTime.now().toString();
    }
}
