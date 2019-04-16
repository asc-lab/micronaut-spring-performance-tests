package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KfwcjrzkevController {

    private final KfwcjrzkevService kfwcjrzkevService;

    public KfwcjrzkevController(KfwcjrzkevService kfwcjrzkevService) {
        this.kfwcjrzkevService = kfwcjrzkevService;
    }

    @RequestMapping("/kfwcjrzkev")
    public String index() {
        return kfwcjrzkevService.getGreeting();
    }

}
