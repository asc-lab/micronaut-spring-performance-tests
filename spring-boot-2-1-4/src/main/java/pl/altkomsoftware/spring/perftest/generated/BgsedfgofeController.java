package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BgsedfgofeController {

    private final BgsedfgofeService bgsedfgofeService;

    public BgsedfgofeController(BgsedfgofeService bgsedfgofeService) {
        this.bgsedfgofeService = bgsedfgofeService;
    }

    @RequestMapping("/bgsedfgofe")
    public String index() {
        return bgsedfgofeService.getGreeting();
    }

}
