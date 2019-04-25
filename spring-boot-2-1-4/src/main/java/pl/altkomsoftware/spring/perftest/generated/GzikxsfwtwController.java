package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GzikxsfwtwController {

    private final GzikxsfwtwService gzikxsfwtwService;

    public GzikxsfwtwController(GzikxsfwtwService gzikxsfwtwService) {
        this.gzikxsfwtwService = gzikxsfwtwService;
    }

    @RequestMapping("/gzikxsfwtw")
    public String index() {
        return gzikxsfwtwService.getGreeting();
    }

}
