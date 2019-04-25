package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XallugqttjController {

    private final XallugqttjService xallugqttjService;

    public XallugqttjController(XallugqttjService xallugqttjService) {
        this.xallugqttjService = xallugqttjService;
    }

    @RequestMapping("/xallugqttj")
    public String index() {
        return xallugqttjService.getGreeting();
    }

}
