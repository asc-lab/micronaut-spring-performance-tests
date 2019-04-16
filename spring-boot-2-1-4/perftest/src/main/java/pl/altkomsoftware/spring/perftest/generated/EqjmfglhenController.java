package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EqjmfglhenController {

    private final EqjmfglhenService eqjmfglhenService;

    public EqjmfglhenController(EqjmfglhenService eqjmfglhenService) {
        this.eqjmfglhenService = eqjmfglhenService;
    }

    @RequestMapping("/eqjmfglhen")
    public String index() {
        return eqjmfglhenService.getGreeting();
    }

}
