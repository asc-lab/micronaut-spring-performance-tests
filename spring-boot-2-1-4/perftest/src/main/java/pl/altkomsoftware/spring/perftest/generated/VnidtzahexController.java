package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VnidtzahexController {

    private final VnidtzahexService vnidtzahexService;

    public VnidtzahexController(VnidtzahexService vnidtzahexService) {
        this.vnidtzahexService = vnidtzahexService;
    }

    @RequestMapping("/vnidtzahex")
    public String index() {
        return vnidtzahexService.getGreeting();
    }

}
