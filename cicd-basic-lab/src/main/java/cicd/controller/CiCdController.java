package cicd.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CiCdController {

    @GetMapping("/ci-cd")
    public Map<String, String> getCiCd() {
        return Map.of("app", "ci-cd");
    }
}