package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EglaicumhoController {

    private final EglaicumhoService eglaicumhoService;

    public EglaicumhoController(EglaicumhoService eglaicumhoService) {
        this.eglaicumhoService = eglaicumhoService;
    }

    @RequestMapping("/eglaicumho")
    public String index() {
        return eglaicumhoService.getGreeting();
    }

}
