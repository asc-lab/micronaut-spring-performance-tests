package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WktizszgvwController {

    private final WktizszgvwService wktizszgvwService;

    public WktizszgvwController(WktizszgvwService wktizszgvwService) {
        this.wktizszgvwService = wktizszgvwService;
    }

    @RequestMapping("/wktizszgvw")
    public String index() {
        return wktizszgvwService.getGreeting();
    }

}
