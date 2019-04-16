package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LahfexposfController {

    private final LahfexposfService lahfexposfService;

    public LahfexposfController(LahfexposfService lahfexposfService) {
        this.lahfexposfService = lahfexposfService;
    }

    @RequestMapping("/lahfexposf")
    public String index() {
        return lahfexposfService.getGreeting();
    }

}
