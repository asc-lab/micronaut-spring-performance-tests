package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KloammmyuqController {

    private final KloammmyuqService kloammmyuqService;

    public KloammmyuqController(KloammmyuqService kloammmyuqService) {
        this.kloammmyuqService = kloammmyuqService;
    }

    @RequestMapping("/kloammmyuq")
    public String index() {
        return kloammmyuqService.getGreeting();
    }

}
