package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QfvckpzxsvController {

    private final QfvckpzxsvService qfvckpzxsvService;

    public QfvckpzxsvController(QfvckpzxsvService qfvckpzxsvService) {
        this.qfvckpzxsvService = qfvckpzxsvService;
    }

    @RequestMapping("/qfvckpzxsv")
    public String index() {
        return qfvckpzxsvService.getGreeting();
    }

}
