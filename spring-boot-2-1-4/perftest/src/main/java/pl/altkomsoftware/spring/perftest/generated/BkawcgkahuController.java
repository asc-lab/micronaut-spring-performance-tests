package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BkawcgkahuController {

    private final BkawcgkahuService bkawcgkahuService;

    public BkawcgkahuController(BkawcgkahuService bkawcgkahuService) {
        this.bkawcgkahuService = bkawcgkahuService;
    }

    @RequestMapping("/bkawcgkahu")
    public String index() {
        return bkawcgkahuService.getGreeting();
    }

}
