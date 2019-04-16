package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PwizjdqewnController {

    private final PwizjdqewnService pwizjdqewnService;

    public PwizjdqewnController(PwizjdqewnService pwizjdqewnService) {
        this.pwizjdqewnService = pwizjdqewnService;
    }

    @RequestMapping("/pwizjdqewn")
    public String index() {
        return pwizjdqewnService.getGreeting();
    }

}
