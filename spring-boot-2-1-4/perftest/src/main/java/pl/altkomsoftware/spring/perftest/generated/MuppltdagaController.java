package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MuppltdagaController {

    private final MuppltdagaService muppltdagaService;

    public MuppltdagaController(MuppltdagaService muppltdagaService) {
        this.muppltdagaService = muppltdagaService;
    }

    @RequestMapping("/muppltdaga")
    public String index() {
        return muppltdagaService.getGreeting();
    }

}
