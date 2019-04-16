package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BwkveynjyqController {

    private final BwkveynjyqService bwkveynjyqService;

    public BwkveynjyqController(BwkveynjyqService bwkveynjyqService) {
        this.bwkveynjyqService = bwkveynjyqService;
    }

    @RequestMapping("/bwkveynjyq")
    public String index() {
        return bwkveynjyqService.getGreeting();
    }

}
