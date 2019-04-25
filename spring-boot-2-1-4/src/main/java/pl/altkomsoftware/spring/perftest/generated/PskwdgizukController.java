package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PskwdgizukController {

    private final PskwdgizukService pskwdgizukService;

    public PskwdgizukController(PskwdgizukService pskwdgizukService) {
        this.pskwdgizukService = pskwdgizukService;
    }

    @RequestMapping("/pskwdgizuk")
    public String index() {
        return pskwdgizukService.getGreeting();
    }

}
