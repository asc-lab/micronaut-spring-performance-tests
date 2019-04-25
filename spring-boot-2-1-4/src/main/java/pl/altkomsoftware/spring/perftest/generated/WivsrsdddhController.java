package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WivsrsdddhController {

    private final WivsrsdddhService wivsrsdddhService;

    public WivsrsdddhController(WivsrsdddhService wivsrsdddhService) {
        this.wivsrsdddhService = wivsrsdddhService;
    }

    @RequestMapping("/wivsrsdddh")
    public String index() {
        return wivsrsdddhService.getGreeting();
    }

}
