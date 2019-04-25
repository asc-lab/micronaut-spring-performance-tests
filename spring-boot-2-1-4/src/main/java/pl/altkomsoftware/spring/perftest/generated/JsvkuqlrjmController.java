package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JsvkuqlrjmController {

    private final JsvkuqlrjmService jsvkuqlrjmService;

    public JsvkuqlrjmController(JsvkuqlrjmService jsvkuqlrjmService) {
        this.jsvkuqlrjmService = jsvkuqlrjmService;
    }

    @RequestMapping("/jsvkuqlrjm")
    public String index() {
        return jsvkuqlrjmService.getGreeting();
    }

}
