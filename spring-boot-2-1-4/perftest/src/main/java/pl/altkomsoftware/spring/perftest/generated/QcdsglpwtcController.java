package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QcdsglpwtcController {

    private final QcdsglpwtcService qcdsglpwtcService;

    public QcdsglpwtcController(QcdsglpwtcService qcdsglpwtcService) {
        this.qcdsglpwtcService = qcdsglpwtcService;
    }

    @RequestMapping("/qcdsglpwtc")
    public String index() {
        return qcdsglpwtcService.getGreeting();
    }

}
