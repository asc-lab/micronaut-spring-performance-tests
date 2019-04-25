package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SzorcqzeeeController {

    private final SzorcqzeeeService szorcqzeeeService;

    public SzorcqzeeeController(SzorcqzeeeService szorcqzeeeService) {
        this.szorcqzeeeService = szorcqzeeeService;
    }

    @RequestMapping("/szorcqzeee")
    public String index() {
        return szorcqzeeeService.getGreeting();
    }

}
