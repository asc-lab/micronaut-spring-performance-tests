package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OhmsvzjbarController {

    private final OhmsvzjbarService ohmsvzjbarService;

    public OhmsvzjbarController(OhmsvzjbarService ohmsvzjbarService) {
        this.ohmsvzjbarService = ohmsvzjbarService;
    }

    @RequestMapping("/ohmsvzjbar")
    public String index() {
        return ohmsvzjbarService.getGreeting();
    }

}
