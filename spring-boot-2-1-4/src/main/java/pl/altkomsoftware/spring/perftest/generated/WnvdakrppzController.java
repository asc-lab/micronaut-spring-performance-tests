package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WnvdakrppzController {

    private final WnvdakrppzService wnvdakrppzService;

    public WnvdakrppzController(WnvdakrppzService wnvdakrppzService) {
        this.wnvdakrppzService = wnvdakrppzService;
    }

    @RequestMapping("/wnvdakrppz")
    public String index() {
        return wnvdakrppzService.getGreeting();
    }

}
