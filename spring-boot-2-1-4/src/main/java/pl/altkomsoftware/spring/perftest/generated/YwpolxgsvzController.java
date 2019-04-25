package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YwpolxgsvzController {

    private final YwpolxgsvzService ywpolxgsvzService;

    public YwpolxgsvzController(YwpolxgsvzService ywpolxgsvzService) {
        this.ywpolxgsvzService = ywpolxgsvzService;
    }

    @RequestMapping("/ywpolxgsvz")
    public String index() {
        return ywpolxgsvzService.getGreeting();
    }

}
