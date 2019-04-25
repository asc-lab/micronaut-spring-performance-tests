package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RgaqilkhuvController {

    private final RgaqilkhuvService rgaqilkhuvService;

    public RgaqilkhuvController(RgaqilkhuvService rgaqilkhuvService) {
        this.rgaqilkhuvService = rgaqilkhuvService;
    }

    @RequestMapping("/rgaqilkhuv")
    public String index() {
        return rgaqilkhuvService.getGreeting();
    }

}
