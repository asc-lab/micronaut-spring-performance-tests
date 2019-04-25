package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IhmxdetkubController {

    private final IhmxdetkubService ihmxdetkubService;

    public IhmxdetkubController(IhmxdetkubService ihmxdetkubService) {
        this.ihmxdetkubService = ihmxdetkubService;
    }

    @RequestMapping("/ihmxdetkub")
    public String index() {
        return ihmxdetkubService.getGreeting();
    }

}
