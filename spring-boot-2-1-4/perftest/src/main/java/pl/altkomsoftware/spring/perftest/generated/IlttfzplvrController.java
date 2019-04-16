package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IlttfzplvrController {

    private final IlttfzplvrService ilttfzplvrService;

    public IlttfzplvrController(IlttfzplvrService ilttfzplvrService) {
        this.ilttfzplvrService = ilttfzplvrService;
    }

    @RequestMapping("/ilttfzplvr")
    public String index() {
        return ilttfzplvrService.getGreeting();
    }

}
