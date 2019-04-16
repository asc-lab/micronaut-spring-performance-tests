package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TcvkzqnlgzController {

    private final TcvkzqnlgzService tcvkzqnlgzService;

    public TcvkzqnlgzController(TcvkzqnlgzService tcvkzqnlgzService) {
        this.tcvkzqnlgzService = tcvkzqnlgzService;
    }

    @RequestMapping("/tcvkzqnlgz")
    public String index() {
        return tcvkzqnlgzService.getGreeting();
    }

}
