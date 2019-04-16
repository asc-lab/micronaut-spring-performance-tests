package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NjlimrajaxController {

    private final NjlimrajaxService njlimrajaxService;

    public NjlimrajaxController(NjlimrajaxService njlimrajaxService) {
        this.njlimrajaxService = njlimrajaxService;
    }

    @RequestMapping("/njlimrajax")
    public String index() {
        return njlimrajaxService.getGreeting();
    }

}
