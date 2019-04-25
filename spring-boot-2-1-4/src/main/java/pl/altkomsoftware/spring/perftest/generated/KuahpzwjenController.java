package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KuahpzwjenController {

    private final KuahpzwjenService kuahpzwjenService;

    public KuahpzwjenController(KuahpzwjenService kuahpzwjenService) {
        this.kuahpzwjenService = kuahpzwjenService;
    }

    @RequestMapping("/kuahpzwjen")
    public String index() {
        return kuahpzwjenService.getGreeting();
    }

}
