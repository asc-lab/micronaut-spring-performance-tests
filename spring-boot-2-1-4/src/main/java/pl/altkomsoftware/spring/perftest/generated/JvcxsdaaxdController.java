package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JvcxsdaaxdController {

    private final JvcxsdaaxdService jvcxsdaaxdService;

    public JvcxsdaaxdController(JvcxsdaaxdService jvcxsdaaxdService) {
        this.jvcxsdaaxdService = jvcxsdaaxdService;
    }

    @RequestMapping("/jvcxsdaaxd")
    public String index() {
        return jvcxsdaaxdService.getGreeting();
    }

}
