package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TkcynxjeeyController {

    private final TkcynxjeeyService tkcynxjeeyService;

    public TkcynxjeeyController(TkcynxjeeyService tkcynxjeeyService) {
        this.tkcynxjeeyService = tkcynxjeeyService;
    }

    @RequestMapping("/tkcynxjeey")
    public String index() {
        return tkcynxjeeyService.getGreeting();
    }

}
