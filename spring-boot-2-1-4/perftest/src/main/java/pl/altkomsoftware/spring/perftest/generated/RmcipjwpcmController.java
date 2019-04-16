package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RmcipjwpcmController {

    private final RmcipjwpcmService rmcipjwpcmService;

    public RmcipjwpcmController(RmcipjwpcmService rmcipjwpcmService) {
        this.rmcipjwpcmService = rmcipjwpcmService;
    }

    @RequestMapping("/rmcipjwpcm")
    public String index() {
        return rmcipjwpcmService.getGreeting();
    }

}
