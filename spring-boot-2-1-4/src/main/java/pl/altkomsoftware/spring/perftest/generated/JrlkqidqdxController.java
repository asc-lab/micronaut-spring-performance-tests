package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JrlkqidqdxController {

    private final JrlkqidqdxService jrlkqidqdxService;

    public JrlkqidqdxController(JrlkqidqdxService jrlkqidqdxService) {
        this.jrlkqidqdxService = jrlkqidqdxService;
    }

    @RequestMapping("/jrlkqidqdx")
    public String index() {
        return jrlkqidqdxService.getGreeting();
    }

}
