package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KwwxijfchaController {

    private final KwwxijfchaService kwwxijfchaService;

    public KwwxijfchaController(KwwxijfchaService kwwxijfchaService) {
        this.kwwxijfchaService = kwwxijfchaService;
    }

    @RequestMapping("/kwwxijfcha")
    public String index() {
        return kwwxijfchaService.getGreeting();
    }

}
