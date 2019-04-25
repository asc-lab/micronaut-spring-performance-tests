package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QofjqgytdtController {

    private final QofjqgytdtService qofjqgytdtService;

    public QofjqgytdtController(QofjqgytdtService qofjqgytdtService) {
        this.qofjqgytdtService = qofjqgytdtService;
    }

    @RequestMapping("/qofjqgytdt")
    public String index() {
        return qofjqgytdtService.getGreeting();
    }

}
