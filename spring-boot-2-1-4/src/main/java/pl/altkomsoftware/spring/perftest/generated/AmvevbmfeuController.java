package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AmvevbmfeuController {

    private final AmvevbmfeuService amvevbmfeuService;

    public AmvevbmfeuController(AmvevbmfeuService amvevbmfeuService) {
        this.amvevbmfeuService = amvevbmfeuService;
    }

    @RequestMapping("/amvevbmfeu")
    public String index() {
        return amvevbmfeuService.getGreeting();
    }

}
