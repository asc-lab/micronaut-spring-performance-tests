package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JmtpogifeyController {

    private final JmtpogifeyService jmtpogifeyService;

    public JmtpogifeyController(JmtpogifeyService jmtpogifeyService) {
        this.jmtpogifeyService = jmtpogifeyService;
    }

    @RequestMapping("/jmtpogifey")
    public String index() {
        return jmtpogifeyService.getGreeting();
    }

}
