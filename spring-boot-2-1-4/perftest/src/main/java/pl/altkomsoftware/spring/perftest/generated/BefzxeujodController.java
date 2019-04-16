package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BefzxeujodController {

    private final BefzxeujodService befzxeujodService;

    public BefzxeujodController(BefzxeujodService befzxeujodService) {
        this.befzxeujodService = befzxeujodService;
    }

    @RequestMapping("/befzxeujod")
    public String index() {
        return befzxeujodService.getGreeting();
    }

}
