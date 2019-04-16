package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JkymlahtmxController {

    private final JkymlahtmxService jkymlahtmxService;

    public JkymlahtmxController(JkymlahtmxService jkymlahtmxService) {
        this.jkymlahtmxService = jkymlahtmxService;
    }

    @RequestMapping("/jkymlahtmx")
    public String index() {
        return jkymlahtmxService.getGreeting();
    }

}
