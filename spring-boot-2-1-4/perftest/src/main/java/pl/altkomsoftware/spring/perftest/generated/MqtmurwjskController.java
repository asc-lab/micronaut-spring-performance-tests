package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MqtmurwjskController {

    private final MqtmurwjskService mqtmurwjskService;

    public MqtmurwjskController(MqtmurwjskService mqtmurwjskService) {
        this.mqtmurwjskService = mqtmurwjskService;
    }

    @RequestMapping("/mqtmurwjsk")
    public String index() {
        return mqtmurwjskService.getGreeting();
    }

}
