package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JxqzcmopmyController {

    private final JxqzcmopmyService jxqzcmopmyService;

    public JxqzcmopmyController(JxqzcmopmyService jxqzcmopmyService) {
        this.jxqzcmopmyService = jxqzcmopmyService;
    }

    @RequestMapping("/jxqzcmopmy")
    public String index() {
        return jxqzcmopmyService.getGreeting();
    }

}
