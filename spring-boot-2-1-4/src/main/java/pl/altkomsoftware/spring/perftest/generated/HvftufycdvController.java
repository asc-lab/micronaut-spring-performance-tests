package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HvftufycdvController {

    private final HvftufycdvService hvftufycdvService;

    public HvftufycdvController(HvftufycdvService hvftufycdvService) {
        this.hvftufycdvService = hvftufycdvService;
    }

    @RequestMapping("/hvftufycdv")
    public String index() {
        return hvftufycdvService.getGreeting();
    }

}
