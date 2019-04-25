package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TwmorxmgyvController {

    private final TwmorxmgyvService twmorxmgyvService;

    public TwmorxmgyvController(TwmorxmgyvService twmorxmgyvService) {
        this.twmorxmgyvService = twmorxmgyvService;
    }

    @RequestMapping("/twmorxmgyv")
    public String index() {
        return twmorxmgyvService.getGreeting();
    }

}
