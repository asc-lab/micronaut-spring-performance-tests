package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ElwbwrcxxmController {

    private final ElwbwrcxxmService elwbwrcxxmService;

    public ElwbwrcxxmController(ElwbwrcxxmService elwbwrcxxmService) {
        this.elwbwrcxxmService = elwbwrcxxmService;
    }

    @RequestMapping("/elwbwrcxxm")
    public String index() {
        return elwbwrcxxmService.getGreeting();
    }

}
