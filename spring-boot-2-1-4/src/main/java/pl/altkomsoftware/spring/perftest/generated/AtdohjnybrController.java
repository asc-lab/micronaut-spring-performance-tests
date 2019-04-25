package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AtdohjnybrController {

    private final AtdohjnybrService atdohjnybrService;

    public AtdohjnybrController(AtdohjnybrService atdohjnybrService) {
        this.atdohjnybrService = atdohjnybrService;
    }

    @RequestMapping("/atdohjnybr")
    public String index() {
        return atdohjnybrService.getGreeting();
    }

}
