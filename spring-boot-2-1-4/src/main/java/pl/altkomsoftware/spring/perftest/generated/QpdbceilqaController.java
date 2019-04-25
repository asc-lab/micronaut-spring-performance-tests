package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QpdbceilqaController {

    private final QpdbceilqaService qpdbceilqaService;

    public QpdbceilqaController(QpdbceilqaService qpdbceilqaService) {
        this.qpdbceilqaService = qpdbceilqaService;
    }

    @RequestMapping("/qpdbceilqa")
    public String index() {
        return qpdbceilqaService.getGreeting();
    }

}
