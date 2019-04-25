package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QbxnkoollhController {

    private final QbxnkoollhService qbxnkoollhService;

    public QbxnkoollhController(QbxnkoollhService qbxnkoollhService) {
        this.qbxnkoollhService = qbxnkoollhService;
    }

    @RequestMapping("/qbxnkoollh")
    public String index() {
        return qbxnkoollhService.getGreeting();
    }

}
