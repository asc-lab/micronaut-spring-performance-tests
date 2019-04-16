package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WavqiffamgController {

    private final WavqiffamgService wavqiffamgService;

    public WavqiffamgController(WavqiffamgService wavqiffamgService) {
        this.wavqiffamgService = wavqiffamgService;
    }

    @RequestMapping("/wavqiffamg")
    public String index() {
        return wavqiffamgService.getGreeting();
    }

}
