package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SdyzifbvziController {

    private final SdyzifbvziService sdyzifbvziService;

    public SdyzifbvziController(SdyzifbvziService sdyzifbvziService) {
        this.sdyzifbvziService = sdyzifbvziService;
    }

    @RequestMapping("/sdyzifbvzi")
    public String index() {
        return sdyzifbvziService.getGreeting();
    }

}
