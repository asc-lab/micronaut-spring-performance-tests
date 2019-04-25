package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LuwswiiwecController {

    private final LuwswiiwecService luwswiiwecService;

    public LuwswiiwecController(LuwswiiwecService luwswiiwecService) {
        this.luwswiiwecService = luwswiiwecService;
    }

    @RequestMapping("/luwswiiwec")
    public String index() {
        return luwswiiwecService.getGreeting();
    }

}
