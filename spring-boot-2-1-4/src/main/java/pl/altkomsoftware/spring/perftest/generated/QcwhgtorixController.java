package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QcwhgtorixController {

    private final QcwhgtorixService qcwhgtorixService;

    public QcwhgtorixController(QcwhgtorixService qcwhgtorixService) {
        this.qcwhgtorixService = qcwhgtorixService;
    }

    @RequestMapping("/qcwhgtorix")
    public String index() {
        return qcwhgtorixService.getGreeting();
    }

}
