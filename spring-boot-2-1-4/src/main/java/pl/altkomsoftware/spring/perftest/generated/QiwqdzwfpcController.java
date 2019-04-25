package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QiwqdzwfpcController {

    private final QiwqdzwfpcService qiwqdzwfpcService;

    public QiwqdzwfpcController(QiwqdzwfpcService qiwqdzwfpcService) {
        this.qiwqdzwfpcService = qiwqdzwfpcService;
    }

    @RequestMapping("/qiwqdzwfpc")
    public String index() {
        return qiwqdzwfpcService.getGreeting();
    }

}
