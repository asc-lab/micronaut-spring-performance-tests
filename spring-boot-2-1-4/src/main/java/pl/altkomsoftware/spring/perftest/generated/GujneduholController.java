package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GujneduholController {

    private final GujneduholService gujneduholService;

    public GujneduholController(GujneduholService gujneduholService) {
        this.gujneduholService = gujneduholService;
    }

    @RequestMapping("/gujneduhol")
    public String index() {
        return gujneduholService.getGreeting();
    }

}
