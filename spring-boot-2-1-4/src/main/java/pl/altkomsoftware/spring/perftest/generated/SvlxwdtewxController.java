package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SvlxwdtewxController {

    private final SvlxwdtewxService svlxwdtewxService;

    public SvlxwdtewxController(SvlxwdtewxService svlxwdtewxService) {
        this.svlxwdtewxService = svlxwdtewxService;
    }

    @RequestMapping("/svlxwdtewx")
    public String index() {
        return svlxwdtewxService.getGreeting();
    }

}
