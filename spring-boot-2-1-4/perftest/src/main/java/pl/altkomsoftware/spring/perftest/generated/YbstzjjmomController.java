package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YbstzjjmomController {

    private final YbstzjjmomService ybstzjjmomService;

    public YbstzjjmomController(YbstzjjmomService ybstzjjmomService) {
        this.ybstzjjmomService = ybstzjjmomService;
    }

    @RequestMapping("/ybstzjjmom")
    public String index() {
        return ybstzjjmomService.getGreeting();
    }

}
