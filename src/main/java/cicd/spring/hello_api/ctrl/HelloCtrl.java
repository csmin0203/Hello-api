package cicd.spring.hello_api.ctrl;

import org.springframework.web.bind.annotation.RestController;

import cicd.spring.hello_api.ctrl.*;
import cicd.spring.hello_api.dto.HelloResponseDTO;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloCtrl {
    
    @GetMapping("/hello")
    public HelloResponseDTO getHello() {
        ZonedDateTime seoulTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        double timestamp = System.currentTimeMillis();

        String message = "Hello, world";

        return new HelloResponseDTO(seoulTime.toString(), timestamp, message);
    }
    
}
