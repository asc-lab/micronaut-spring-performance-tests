package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OcxhbujecfController {

    private final OcxhbujecfService ocxhbujecfService;

    public OcxhbujecfController(OcxhbujecfService ocxhbujecfService) {
        this.ocxhbujecfService = ocxhbujecfService;
    }

    @RequestMapping("/ocxhbujecf")
    public String index() {
        return ocxhbujecfService.getGreeting();
    }

}
