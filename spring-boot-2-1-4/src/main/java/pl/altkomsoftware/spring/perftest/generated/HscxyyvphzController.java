package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HscxyyvphzController {

    private final HscxyyvphzService hscxyyvphzService;

    public HscxyyvphzController(HscxyyvphzService hscxyyvphzService) {
        this.hscxyyvphzService = hscxyyvphzService;
    }

    @RequestMapping("/hscxyyvphz")
    public String index() {
        return hscxyyvphzService.getGreeting();
    }

}
