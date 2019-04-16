package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VgwplvczeyController {

    private final VgwplvczeyService vgwplvczeyService;

    public VgwplvczeyController(VgwplvczeyService vgwplvczeyService) {
        this.vgwplvczeyService = vgwplvczeyService;
    }

    @RequestMapping("/vgwplvczey")
    public String index() {
        return vgwplvczeyService.getGreeting();
    }

}
