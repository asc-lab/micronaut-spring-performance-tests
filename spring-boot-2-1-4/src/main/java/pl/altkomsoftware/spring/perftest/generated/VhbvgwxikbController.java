package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VhbvgwxikbController {

    private final VhbvgwxikbService vhbvgwxikbService;

    public VhbvgwxikbController(VhbvgwxikbService vhbvgwxikbService) {
        this.vhbvgwxikbService = vhbvgwxikbService;
    }

    @RequestMapping("/vhbvgwxikb")
    public String index() {
        return vhbvgwxikbService.getGreeting();
    }

}
