package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QkbhfbewkqController {

    private final QkbhfbewkqService qkbhfbewkqService;

    public QkbhfbewkqController(QkbhfbewkqService qkbhfbewkqService) {
        this.qkbhfbewkqService = qkbhfbewkqService;
    }

    @RequestMapping("/qkbhfbewkq")
    public String index() {
        return qkbhfbewkqService.getGreeting();
    }

}
