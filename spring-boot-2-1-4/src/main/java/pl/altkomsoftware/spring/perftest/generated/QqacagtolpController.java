package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QqacagtolpController {

    private final QqacagtolpService qqacagtolpService;

    public QqacagtolpController(QqacagtolpService qqacagtolpService) {
        this.qqacagtolpService = qqacagtolpService;
    }

    @RequestMapping("/qqacagtolp")
    public String index() {
        return qqacagtolpService.getGreeting();
    }

}
