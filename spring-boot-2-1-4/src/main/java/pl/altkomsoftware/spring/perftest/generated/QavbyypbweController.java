package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QavbyypbweController {

    private final QavbyypbweService qavbyypbweService;

    public QavbyypbweController(QavbyypbweService qavbyypbweService) {
        this.qavbyypbweService = qavbyypbweService;
    }

    @RequestMapping("/qavbyypbwe")
    public String index() {
        return qavbyypbweService.getGreeting();
    }

}
