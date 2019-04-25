package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JmrhzrhkguController {

    private final JmrhzrhkguService jmrhzrhkguService;

    public JmrhzrhkguController(JmrhzrhkguService jmrhzrhkguService) {
        this.jmrhzrhkguService = jmrhzrhkguService;
    }

    @RequestMapping("/jmrhzrhkgu")
    public String index() {
        return jmrhzrhkguService.getGreeting();
    }

}
