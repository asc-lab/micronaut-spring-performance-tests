package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JowovngdswController {

    private final JowovngdswService jowovngdswService;

    public JowovngdswController(JowovngdswService jowovngdswService) {
        this.jowovngdswService = jowovngdswService;
    }

    @RequestMapping("/jowovngdsw")
    public String index() {
        return jowovngdswService.getGreeting();
    }

}
