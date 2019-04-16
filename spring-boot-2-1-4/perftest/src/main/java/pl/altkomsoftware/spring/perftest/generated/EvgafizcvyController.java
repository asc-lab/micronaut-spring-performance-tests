package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EvgafizcvyController {

    private final EvgafizcvyService evgafizcvyService;

    public EvgafizcvyController(EvgafizcvyService evgafizcvyService) {
        this.evgafizcvyService = evgafizcvyService;
    }

    @RequestMapping("/evgafizcvy")
    public String index() {
        return evgafizcvyService.getGreeting();
    }

}
