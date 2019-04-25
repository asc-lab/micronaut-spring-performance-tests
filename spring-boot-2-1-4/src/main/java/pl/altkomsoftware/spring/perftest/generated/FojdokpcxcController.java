package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FojdokpcxcController {

    private final FojdokpcxcService fojdokpcxcService;

    public FojdokpcxcController(FojdokpcxcService fojdokpcxcService) {
        this.fojdokpcxcService = fojdokpcxcService;
    }

    @RequestMapping("/fojdokpcxc")
    public String index() {
        return fojdokpcxcService.getGreeting();
    }

}
