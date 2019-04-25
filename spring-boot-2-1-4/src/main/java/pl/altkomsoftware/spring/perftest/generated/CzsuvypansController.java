package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CzsuvypansController {

    private final CzsuvypansService czsuvypansService;

    public CzsuvypansController(CzsuvypansService czsuvypansService) {
        this.czsuvypansService = czsuvypansService;
    }

    @RequestMapping("/czsuvypans")
    public String index() {
        return czsuvypansService.getGreeting();
    }

}
