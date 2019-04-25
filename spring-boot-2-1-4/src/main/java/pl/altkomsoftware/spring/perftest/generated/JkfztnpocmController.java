package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JkfztnpocmController {

    private final JkfztnpocmService jkfztnpocmService;

    public JkfztnpocmController(JkfztnpocmService jkfztnpocmService) {
        this.jkfztnpocmService = jkfztnpocmService;
    }

    @RequestMapping("/jkfztnpocm")
    public String index() {
        return jkfztnpocmService.getGreeting();
    }

}
