package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AbjtrragqzController {

    private final AbjtrragqzService abjtrragqzService;

    public AbjtrragqzController(AbjtrragqzService abjtrragqzService) {
        this.abjtrragqzService = abjtrragqzService;
    }

    @RequestMapping("/abjtrragqz")
    public String index() {
        return abjtrragqzService.getGreeting();
    }

}
