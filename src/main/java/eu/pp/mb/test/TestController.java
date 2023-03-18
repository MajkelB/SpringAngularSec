package eu.pp.mb.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${app.version}")
    private String version;

    @Value("${app.env}")
    private String env;

    @GetMapping("/test")
    String test() {
        return "OK";
    }

    @GetMapping("/bye")
    String bye() {
        return "Bye";
    }

    @GetMapping("/sec/env")
    String env() {
        return "Env: " + env;
    }

    @GetMapping("/sec/version")
    String version() {
        return version;
    }

    @GetMapping("/sec/user")
    String userAccess() {
        return "User OK";
    }

    @GetMapping("/sec/admin")
    String adminAccess() {
        return "Admin OK";
    }

}
