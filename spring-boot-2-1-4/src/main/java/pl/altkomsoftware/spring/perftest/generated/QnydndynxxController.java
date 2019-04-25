package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QnydndynxxController {

    private final QnydndynxxService qnydndynxxService;

    public QnydndynxxController(QnydndynxxService qnydndynxxService) {
        this.qnydndynxxService = qnydndynxxService;
    }

    @RequestMapping("/qnydndynxx")
    public String index() {
        return qnydndynxxService.getGreeting();
    }

}
