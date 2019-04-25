package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BsuaopadlhController {

    private final BsuaopadlhService bsuaopadlhService;

    public BsuaopadlhController(BsuaopadlhService bsuaopadlhService) {
        this.bsuaopadlhService = bsuaopadlhService;
    }

    @RequestMapping("/bsuaopadlh")
    public String index() {
        return bsuaopadlhService.getGreeting();
    }

}
