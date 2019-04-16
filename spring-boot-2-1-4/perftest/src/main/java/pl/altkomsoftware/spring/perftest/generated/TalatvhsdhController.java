package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TalatvhsdhController {

    private final TalatvhsdhService talatvhsdhService;

    public TalatvhsdhController(TalatvhsdhService talatvhsdhService) {
        this.talatvhsdhService = talatvhsdhService;
    }

    @RequestMapping("/talatvhsdh")
    public String index() {
        return talatvhsdhService.getGreeting();
    }

}
