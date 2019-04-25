package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TnuxfuzwvlController {

    private final TnuxfuzwvlService tnuxfuzwvlService;

    public TnuxfuzwvlController(TnuxfuzwvlService tnuxfuzwvlService) {
        this.tnuxfuzwvlService = tnuxfuzwvlService;
    }

    @RequestMapping("/tnuxfuzwvl")
    public String index() {
        return tnuxfuzwvlService.getGreeting();
    }

}
