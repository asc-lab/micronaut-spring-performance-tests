package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ExjaprtpauController {

    private final ExjaprtpauService exjaprtpauService;

    public ExjaprtpauController(ExjaprtpauService exjaprtpauService) {
        this.exjaprtpauService = exjaprtpauService;
    }

    @RequestMapping("/exjaprtpau")
    public String index() {
        return exjaprtpauService.getGreeting();
    }

}
