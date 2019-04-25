package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BwxxkdbrboController {

    private final BwxxkdbrboService bwxxkdbrboService;

    public BwxxkdbrboController(BwxxkdbrboService bwxxkdbrboService) {
        this.bwxxkdbrboService = bwxxkdbrboService;
    }

    @RequestMapping("/bwxxkdbrbo")
    public String index() {
        return bwxxkdbrboService.getGreeting();
    }

}
