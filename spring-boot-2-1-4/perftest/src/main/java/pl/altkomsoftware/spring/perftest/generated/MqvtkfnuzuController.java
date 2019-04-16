package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MqvtkfnuzuController {

    private final MqvtkfnuzuService mqvtkfnuzuService;

    public MqvtkfnuzuController(MqvtkfnuzuService mqvtkfnuzuService) {
        this.mqvtkfnuzuService = mqvtkfnuzuService;
    }

    @RequestMapping("/mqvtkfnuzu")
    public String index() {
        return mqvtkfnuzuService.getGreeting();
    }

}
