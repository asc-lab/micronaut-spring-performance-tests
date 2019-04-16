package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QcaxpzwoqhController {

    private final QcaxpzwoqhService qcaxpzwoqhService;

    public QcaxpzwoqhController(QcaxpzwoqhService qcaxpzwoqhService) {
        this.qcaxpzwoqhService = qcaxpzwoqhService;
    }

    @RequestMapping("/qcaxpzwoqh")
    public String index() {
        return qcaxpzwoqhService.getGreeting();
    }

}
