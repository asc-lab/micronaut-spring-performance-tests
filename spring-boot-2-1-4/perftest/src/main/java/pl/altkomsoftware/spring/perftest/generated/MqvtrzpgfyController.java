package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MqvtrzpgfyController {

    private final MqvtrzpgfyService mqvtrzpgfyService;

    public MqvtrzpgfyController(MqvtrzpgfyService mqvtrzpgfyService) {
        this.mqvtrzpgfyService = mqvtrzpgfyService;
    }

    @RequestMapping("/mqvtrzpgfy")
    public String index() {
        return mqvtrzpgfyService.getGreeting();
    }

}
