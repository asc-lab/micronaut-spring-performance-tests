package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WgmxiweipgController {

    private final WgmxiweipgService wgmxiweipgService;

    public WgmxiweipgController(WgmxiweipgService wgmxiweipgService) {
        this.wgmxiweipgService = wgmxiweipgService;
    }

    @RequestMapping("/wgmxiweipg")
    public String index() {
        return wgmxiweipgService.getGreeting();
    }

}
