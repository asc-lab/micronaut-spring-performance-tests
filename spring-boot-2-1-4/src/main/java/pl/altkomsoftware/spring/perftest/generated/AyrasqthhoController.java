package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AyrasqthhoController {

    private final AyrasqthhoService ayrasqthhoService;

    public AyrasqthhoController(AyrasqthhoService ayrasqthhoService) {
        this.ayrasqthhoService = ayrasqthhoService;
    }

    @RequestMapping("/ayrasqthho")
    public String index() {
        return ayrasqthhoService.getGreeting();
    }

}
