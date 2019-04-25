package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BjtcapcbmzController {

    private final BjtcapcbmzService bjtcapcbmzService;

    public BjtcapcbmzController(BjtcapcbmzService bjtcapcbmzService) {
        this.bjtcapcbmzService = bjtcapcbmzService;
    }

    @RequestMapping("/bjtcapcbmz")
    public String index() {
        return bjtcapcbmzService.getGreeting();
    }

}
