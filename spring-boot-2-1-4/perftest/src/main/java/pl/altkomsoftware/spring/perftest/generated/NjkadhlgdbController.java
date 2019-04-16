package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NjkadhlgdbController {

    private final NjkadhlgdbService njkadhlgdbService;

    public NjkadhlgdbController(NjkadhlgdbService njkadhlgdbService) {
        this.njkadhlgdbService = njkadhlgdbService;
    }

    @RequestMapping("/njkadhlgdb")
    public String index() {
        return njkadhlgdbService.getGreeting();
    }

}
