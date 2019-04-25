package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FnanareujmController {

    private final FnanareujmService fnanareujmService;

    public FnanareujmController(FnanareujmService fnanareujmService) {
        this.fnanareujmService = fnanareujmService;
    }

    @RequestMapping("/fnanareujm")
    public String index() {
        return fnanareujmService.getGreeting();
    }

}
