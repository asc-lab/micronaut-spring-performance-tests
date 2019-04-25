package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GlijihgqttController {

    private final GlijihgqttService glijihgqttService;

    public GlijihgqttController(GlijihgqttService glijihgqttService) {
        this.glijihgqttService = glijihgqttService;
    }

    @RequestMapping("/glijihgqtt")
    public String index() {
        return glijihgqttService.getGreeting();
    }

}
