package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HotdunfmjrController {

    private final HotdunfmjrService hotdunfmjrService;

    public HotdunfmjrController(HotdunfmjrService hotdunfmjrService) {
        this.hotdunfmjrService = hotdunfmjrService;
    }

    @RequestMapping("/hotdunfmjr")
    public String index() {
        return hotdunfmjrService.getGreeting();
    }

}
