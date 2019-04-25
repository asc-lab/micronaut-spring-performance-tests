package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WburiwbkqkController {

    private final WburiwbkqkService wburiwbkqkService;

    public WburiwbkqkController(WburiwbkqkService wburiwbkqkService) {
        this.wburiwbkqkService = wburiwbkqkService;
    }

    @RequestMapping("/wburiwbkqk")
    public String index() {
        return wburiwbkqkService.getGreeting();
    }

}
