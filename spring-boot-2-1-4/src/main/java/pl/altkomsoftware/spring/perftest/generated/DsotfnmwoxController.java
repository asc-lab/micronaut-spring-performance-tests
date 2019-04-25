package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DsotfnmwoxController {

    private final DsotfnmwoxService dsotfnmwoxService;

    public DsotfnmwoxController(DsotfnmwoxService dsotfnmwoxService) {
        this.dsotfnmwoxService = dsotfnmwoxService;
    }

    @RequestMapping("/dsotfnmwox")
    public String index() {
        return dsotfnmwoxService.getGreeting();
    }

}
