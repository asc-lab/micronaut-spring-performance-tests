package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RhfmmrwittController {

    private final RhfmmrwittService rhfmmrwittService;

    public RhfmmrwittController(RhfmmrwittService rhfmmrwittService) {
        this.rhfmmrwittService = rhfmmrwittService;
    }

    @RequestMapping("/rhfmmrwitt")
    public String index() {
        return rhfmmrwittService.getGreeting();
    }

}
