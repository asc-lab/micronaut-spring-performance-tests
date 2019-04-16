package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YdtkobhtlpController {

    private final YdtkobhtlpService ydtkobhtlpService;

    public YdtkobhtlpController(YdtkobhtlpService ydtkobhtlpService) {
        this.ydtkobhtlpService = ydtkobhtlpService;
    }

    @RequestMapping("/ydtkobhtlp")
    public String index() {
        return ydtkobhtlpService.getGreeting();
    }

}
