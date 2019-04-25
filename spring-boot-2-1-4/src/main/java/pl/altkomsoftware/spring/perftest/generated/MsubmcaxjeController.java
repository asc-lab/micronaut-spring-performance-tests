package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MsubmcaxjeController {

    private final MsubmcaxjeService msubmcaxjeService;

    public MsubmcaxjeController(MsubmcaxjeService msubmcaxjeService) {
        this.msubmcaxjeService = msubmcaxjeService;
    }

    @RequestMapping("/msubmcaxje")
    public String index() {
        return msubmcaxjeService.getGreeting();
    }

}
