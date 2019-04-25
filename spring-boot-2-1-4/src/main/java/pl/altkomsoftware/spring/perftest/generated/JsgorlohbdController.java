package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JsgorlohbdController {

    private final JsgorlohbdService jsgorlohbdService;

    public JsgorlohbdController(JsgorlohbdService jsgorlohbdService) {
        this.jsgorlohbdService = jsgorlohbdService;
    }

    @RequestMapping("/jsgorlohbd")
    public String index() {
        return jsgorlohbdService.getGreeting();
    }

}
