package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CfzkiwtwhgController {

    private final CfzkiwtwhgService cfzkiwtwhgService;

    public CfzkiwtwhgController(CfzkiwtwhgService cfzkiwtwhgService) {
        this.cfzkiwtwhgService = cfzkiwtwhgService;
    }

    @RequestMapping("/cfzkiwtwhg")
    public String index() {
        return cfzkiwtwhgService.getGreeting();
    }

}
