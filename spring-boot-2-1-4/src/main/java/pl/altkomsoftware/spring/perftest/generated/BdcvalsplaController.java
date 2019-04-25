package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BdcvalsplaController {

    private final BdcvalsplaService bdcvalsplaService;

    public BdcvalsplaController(BdcvalsplaService bdcvalsplaService) {
        this.bdcvalsplaService = bdcvalsplaService;
    }

    @RequestMapping("/bdcvalspla")
    public String index() {
        return bdcvalsplaService.getGreeting();
    }

}
