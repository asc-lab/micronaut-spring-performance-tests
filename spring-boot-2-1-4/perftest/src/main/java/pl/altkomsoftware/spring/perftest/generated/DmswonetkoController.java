package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DmswonetkoController {

    private final DmswonetkoService dmswonetkoService;

    public DmswonetkoController(DmswonetkoService dmswonetkoService) {
        this.dmswonetkoService = dmswonetkoService;
    }

    @RequestMapping("/dmswonetko")
    public String index() {
        return dmswonetkoService.getGreeting();
    }

}
