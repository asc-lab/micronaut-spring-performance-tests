package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UolrkdknvcController {

    private final UolrkdknvcService uolrkdknvcService;

    public UolrkdknvcController(UolrkdknvcService uolrkdknvcService) {
        this.uolrkdknvcService = uolrkdknvcService;
    }

    @RequestMapping("/uolrkdknvc")
    public String index() {
        return uolrkdknvcService.getGreeting();
    }

}
