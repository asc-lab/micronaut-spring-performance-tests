package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RsicoukuowController {

    private final RsicoukuowService rsicoukuowService;

    public RsicoukuowController(RsicoukuowService rsicoukuowService) {
        this.rsicoukuowService = rsicoukuowService;
    }

    @RequestMapping("/rsicoukuow")
    public String index() {
        return rsicoukuowService.getGreeting();
    }

}
