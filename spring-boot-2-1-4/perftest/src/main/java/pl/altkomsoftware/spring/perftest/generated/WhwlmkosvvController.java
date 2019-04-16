package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WhwlmkosvvController {

    private final WhwlmkosvvService whwlmkosvvService;

    public WhwlmkosvvController(WhwlmkosvvService whwlmkosvvService) {
        this.whwlmkosvvService = whwlmkosvvService;
    }

    @RequestMapping("/whwlmkosvv")
    public String index() {
        return whwlmkosvvService.getGreeting();
    }

}
