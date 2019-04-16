package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QavwwnblhuController {

    private final QavwwnblhuService qavwwnblhuService;

    public QavwwnblhuController(QavwwnblhuService qavwwnblhuService) {
        this.qavwwnblhuService = qavwwnblhuService;
    }

    @RequestMapping("/qavwwnblhu")
    public String index() {
        return qavwwnblhuService.getGreeting();
    }

}
