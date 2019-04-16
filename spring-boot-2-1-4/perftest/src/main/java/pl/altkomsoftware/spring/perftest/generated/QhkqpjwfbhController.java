package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QhkqpjwfbhController {

    private final QhkqpjwfbhService qhkqpjwfbhService;

    public QhkqpjwfbhController(QhkqpjwfbhService qhkqpjwfbhService) {
        this.qhkqpjwfbhService = qhkqpjwfbhService;
    }

    @RequestMapping("/qhkqpjwfbh")
    public String index() {
        return qhkqpjwfbhService.getGreeting();
    }

}
