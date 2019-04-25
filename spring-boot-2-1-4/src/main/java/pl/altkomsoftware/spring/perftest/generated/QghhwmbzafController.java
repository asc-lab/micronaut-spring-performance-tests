package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QghhwmbzafController {

    private final QghhwmbzafService qghhwmbzafService;

    public QghhwmbzafController(QghhwmbzafService qghhwmbzafService) {
        this.qghhwmbzafService = qghhwmbzafService;
    }

    @RequestMapping("/qghhwmbzaf")
    public String index() {
        return qghhwmbzafService.getGreeting();
    }

}
