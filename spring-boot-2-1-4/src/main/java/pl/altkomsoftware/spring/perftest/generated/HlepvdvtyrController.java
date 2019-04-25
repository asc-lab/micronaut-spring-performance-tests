package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HlepvdvtyrController {

    private final HlepvdvtyrService hlepvdvtyrService;

    public HlepvdvtyrController(HlepvdvtyrService hlepvdvtyrService) {
        this.hlepvdvtyrService = hlepvdvtyrService;
    }

    @RequestMapping("/hlepvdvtyr")
    public String index() {
        return hlepvdvtyrService.getGreeting();
    }

}
