package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PnncfveiesController {

    private final PnncfveiesService pnncfveiesService;

    public PnncfveiesController(PnncfveiesService pnncfveiesService) {
        this.pnncfveiesService = pnncfveiesService;
    }

    @RequestMapping("/pnncfveies")
    public String index() {
        return pnncfveiesService.getGreeting();
    }

}
