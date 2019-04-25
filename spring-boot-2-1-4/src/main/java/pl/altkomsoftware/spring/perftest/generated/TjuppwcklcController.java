package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TjuppwcklcController {

    private final TjuppwcklcService tjuppwcklcService;

    public TjuppwcklcController(TjuppwcklcService tjuppwcklcService) {
        this.tjuppwcklcService = tjuppwcklcService;
    }

    @RequestMapping("/tjuppwcklc")
    public String index() {
        return tjuppwcklcService.getGreeting();
    }

}
