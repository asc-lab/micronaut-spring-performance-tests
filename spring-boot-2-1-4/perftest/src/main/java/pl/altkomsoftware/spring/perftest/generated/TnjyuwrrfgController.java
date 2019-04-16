package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TnjyuwrrfgController {

    private final TnjyuwrrfgService tnjyuwrrfgService;

    public TnjyuwrrfgController(TnjyuwrrfgService tnjyuwrrfgService) {
        this.tnjyuwrrfgService = tnjyuwrrfgService;
    }

    @RequestMapping("/tnjyuwrrfg")
    public String index() {
        return tnjyuwrrfgService.getGreeting();
    }

}
