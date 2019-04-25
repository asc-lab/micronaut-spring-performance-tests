package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YmhelewiylController {

    private final YmhelewiylService ymhelewiylService;

    public YmhelewiylController(YmhelewiylService ymhelewiylService) {
        this.ymhelewiylService = ymhelewiylService;
    }

    @RequestMapping("/ymhelewiyl")
    public String index() {
        return ymhelewiylService.getGreeting();
    }

}
