package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QnptkdngrzController {

    private final QnptkdngrzService qnptkdngrzService;

    public QnptkdngrzController(QnptkdngrzService qnptkdngrzService) {
        this.qnptkdngrzService = qnptkdngrzService;
    }

    @RequestMapping("/qnptkdngrz")
    public String index() {
        return qnptkdngrzService.getGreeting();
    }

}
