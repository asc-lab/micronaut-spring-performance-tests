package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DpouwppdkqController {

    private final DpouwppdkqService dpouwppdkqService;

    public DpouwppdkqController(DpouwppdkqService dpouwppdkqService) {
        this.dpouwppdkqService = dpouwppdkqService;
    }

    @RequestMapping("/dpouwppdkq")
    public String index() {
        return dpouwppdkqService.getGreeting();
    }

}
