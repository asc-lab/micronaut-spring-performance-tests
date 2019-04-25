package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FmxtlneentController {

    private final FmxtlneentService fmxtlneentService;

    public FmxtlneentController(FmxtlneentService fmxtlneentService) {
        this.fmxtlneentService = fmxtlneentService;
    }

    @RequestMapping("/fmxtlneent")
    public String index() {
        return fmxtlneentService.getGreeting();
    }

}
