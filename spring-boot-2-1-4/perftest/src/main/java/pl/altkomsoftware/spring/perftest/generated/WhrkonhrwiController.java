package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WhrkonhrwiController {

    private final WhrkonhrwiService whrkonhrwiService;

    public WhrkonhrwiController(WhrkonhrwiService whrkonhrwiService) {
        this.whrkonhrwiService = whrkonhrwiService;
    }

    @RequestMapping("/whrkonhrwi")
    public String index() {
        return whrkonhrwiService.getGreeting();
    }

}
