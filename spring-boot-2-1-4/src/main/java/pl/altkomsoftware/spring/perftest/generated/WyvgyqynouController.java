package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WyvgyqynouController {

    private final WyvgyqynouService wyvgyqynouService;

    public WyvgyqynouController(WyvgyqynouService wyvgyqynouService) {
        this.wyvgyqynouService = wyvgyqynouService;
    }

    @RequestMapping("/wyvgyqynou")
    public String index() {
        return wyvgyqynouService.getGreeting();
    }

}
