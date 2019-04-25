package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TyelpjsptbController {

    private final TyelpjsptbService tyelpjsptbService;

    public TyelpjsptbController(TyelpjsptbService tyelpjsptbService) {
        this.tyelpjsptbService = tyelpjsptbService;
    }

    @RequestMapping("/tyelpjsptb")
    public String index() {
        return tyelpjsptbService.getGreeting();
    }

}
