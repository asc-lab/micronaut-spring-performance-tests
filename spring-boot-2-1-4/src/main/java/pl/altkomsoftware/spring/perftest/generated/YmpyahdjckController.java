package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YmpyahdjckController {

    private final YmpyahdjckService ympyahdjckService;

    public YmpyahdjckController(YmpyahdjckService ympyahdjckService) {
        this.ympyahdjckService = ympyahdjckService;
    }

    @RequestMapping("/ympyahdjck")
    public String index() {
        return ympyahdjckService.getGreeting();
    }

}
