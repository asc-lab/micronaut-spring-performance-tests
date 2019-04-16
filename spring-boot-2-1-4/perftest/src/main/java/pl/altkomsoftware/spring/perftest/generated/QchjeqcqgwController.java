package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QchjeqcqgwController {

    private final QchjeqcqgwService qchjeqcqgwService;

    public QchjeqcqgwController(QchjeqcqgwService qchjeqcqgwService) {
        this.qchjeqcqgwService = qchjeqcqgwService;
    }

    @RequestMapping("/qchjeqcqgw")
    public String index() {
        return qchjeqcqgwService.getGreeting();
    }

}
