package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AqkoovkzojController {

    private final AqkoovkzojService aqkoovkzojService;

    public AqkoovkzojController(AqkoovkzojService aqkoovkzojService) {
        this.aqkoovkzojService = aqkoovkzojService;
    }

    @RequestMapping("/aqkoovkzoj")
    public String index() {
        return aqkoovkzojService.getGreeting();
    }

}
