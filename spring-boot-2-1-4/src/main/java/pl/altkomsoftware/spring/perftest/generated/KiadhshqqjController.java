package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KiadhshqqjController {

    private final KiadhshqqjService kiadhshqqjService;

    public KiadhshqqjController(KiadhshqqjService kiadhshqqjService) {
        this.kiadhshqqjService = kiadhshqqjService;
    }

    @RequestMapping("/kiadhshqqj")
    public String index() {
        return kiadhshqqjService.getGreeting();
    }

}
