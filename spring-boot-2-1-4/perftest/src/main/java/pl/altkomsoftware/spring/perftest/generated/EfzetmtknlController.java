package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EfzetmtknlController {

    private final EfzetmtknlService efzetmtknlService;

    public EfzetmtknlController(EfzetmtknlService efzetmtknlService) {
        this.efzetmtknlService = efzetmtknlService;
    }

    @RequestMapping("/efzetmtknl")
    public String index() {
        return efzetmtknlService.getGreeting();
    }

}
