package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HoylayanioController {

    private final HoylayanioService hoylayanioService;

    public HoylayanioController(HoylayanioService hoylayanioService) {
        this.hoylayanioService = hoylayanioService;
    }

    @RequestMapping("/hoylayanio")
    public String index() {
        return hoylayanioService.getGreeting();
    }

}
