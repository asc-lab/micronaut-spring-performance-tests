package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BozjxnkexiController {

    private final BozjxnkexiService bozjxnkexiService;

    public BozjxnkexiController(BozjxnkexiService bozjxnkexiService) {
        this.bozjxnkexiService = bozjxnkexiService;
    }

    @RequestMapping("/bozjxnkexi")
    public String index() {
        return bozjxnkexiService.getGreeting();
    }

}
