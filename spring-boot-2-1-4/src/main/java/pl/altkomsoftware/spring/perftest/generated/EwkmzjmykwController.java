package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EwkmzjmykwController {

    private final EwkmzjmykwService ewkmzjmykwService;

    public EwkmzjmykwController(EwkmzjmykwService ewkmzjmykwService) {
        this.ewkmzjmykwService = ewkmzjmykwService;
    }

    @RequestMapping("/ewkmzjmykw")
    public String index() {
        return ewkmzjmykwService.getGreeting();
    }

}
