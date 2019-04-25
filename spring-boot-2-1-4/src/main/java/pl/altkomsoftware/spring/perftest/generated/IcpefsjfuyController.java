package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IcpefsjfuyController {

    private final IcpefsjfuyService icpefsjfuyService;

    public IcpefsjfuyController(IcpefsjfuyService icpefsjfuyService) {
        this.icpefsjfuyService = icpefsjfuyService;
    }

    @RequestMapping("/icpefsjfuy")
    public String index() {
        return icpefsjfuyService.getGreeting();
    }

}
