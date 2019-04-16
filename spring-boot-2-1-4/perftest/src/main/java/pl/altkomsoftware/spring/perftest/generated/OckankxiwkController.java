package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OckankxiwkController {

    private final OckankxiwkService ockankxiwkService;

    public OckankxiwkController(OckankxiwkService ockankxiwkService) {
        this.ockankxiwkService = ockankxiwkService;
    }

    @RequestMapping("/ockankxiwk")
    public String index() {
        return ockankxiwkService.getGreeting();
    }

}
