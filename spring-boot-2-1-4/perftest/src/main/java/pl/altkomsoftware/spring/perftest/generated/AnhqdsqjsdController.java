package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AnhqdsqjsdController {

    private final AnhqdsqjsdService anhqdsqjsdService;

    public AnhqdsqjsdController(AnhqdsqjsdService anhqdsqjsdService) {
        this.anhqdsqjsdService = anhqdsqjsdService;
    }

    @RequestMapping("/anhqdsqjsd")
    public String index() {
        return anhqdsqjsdService.getGreeting();
    }

}
