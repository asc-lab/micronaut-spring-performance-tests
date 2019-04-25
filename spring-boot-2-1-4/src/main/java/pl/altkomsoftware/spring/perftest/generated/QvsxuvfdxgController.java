package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QvsxuvfdxgController {

    private final QvsxuvfdxgService qvsxuvfdxgService;

    public QvsxuvfdxgController(QvsxuvfdxgService qvsxuvfdxgService) {
        this.qvsxuvfdxgService = qvsxuvfdxgService;
    }

    @RequestMapping("/qvsxuvfdxg")
    public String index() {
        return qvsxuvfdxgService.getGreeting();
    }

}
