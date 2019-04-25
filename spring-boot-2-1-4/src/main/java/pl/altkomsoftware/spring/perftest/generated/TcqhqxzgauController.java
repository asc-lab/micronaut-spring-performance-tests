package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TcqhqxzgauController {

    private final TcqhqxzgauService tcqhqxzgauService;

    public TcqhqxzgauController(TcqhqxzgauService tcqhqxzgauService) {
        this.tcqhqxzgauService = tcqhqxzgauService;
    }

    @RequestMapping("/tcqhqxzgau")
    public String index() {
        return tcqhqxzgauService.getGreeting();
    }

}
