package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NipprxdyxjController {

    private final NipprxdyxjService nipprxdyxjService;

    public NipprxdyxjController(NipprxdyxjService nipprxdyxjService) {
        this.nipprxdyxjService = nipprxdyxjService;
    }

    @RequestMapping("/nipprxdyxj")
    public String index() {
        return nipprxdyxjService.getGreeting();
    }

}
