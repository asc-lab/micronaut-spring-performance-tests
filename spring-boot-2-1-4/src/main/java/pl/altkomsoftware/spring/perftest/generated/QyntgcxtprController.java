package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QyntgcxtprController {

    private final QyntgcxtprService qyntgcxtprService;

    public QyntgcxtprController(QyntgcxtprService qyntgcxtprService) {
        this.qyntgcxtprService = qyntgcxtprService;
    }

    @RequestMapping("/qyntgcxtpr")
    public String index() {
        return qyntgcxtprService.getGreeting();
    }

}
