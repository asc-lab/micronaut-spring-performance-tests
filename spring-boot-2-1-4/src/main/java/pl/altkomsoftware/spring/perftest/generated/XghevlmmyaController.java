package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XghevlmmyaController {

    private final XghevlmmyaService xghevlmmyaService;

    public XghevlmmyaController(XghevlmmyaService xghevlmmyaService) {
        this.xghevlmmyaService = xghevlmmyaService;
    }

    @RequestMapping("/xghevlmmya")
    public String index() {
        return xghevlmmyaService.getGreeting();
    }

}
