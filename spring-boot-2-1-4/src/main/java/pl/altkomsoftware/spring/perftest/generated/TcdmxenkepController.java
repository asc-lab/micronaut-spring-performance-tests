package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TcdmxenkepController {

    private final TcdmxenkepService tcdmxenkepService;

    public TcdmxenkepController(TcdmxenkepService tcdmxenkepService) {
        this.tcdmxenkepService = tcdmxenkepService;
    }

    @RequestMapping("/tcdmxenkep")
    public String index() {
        return tcdmxenkepService.getGreeting();
    }

}
