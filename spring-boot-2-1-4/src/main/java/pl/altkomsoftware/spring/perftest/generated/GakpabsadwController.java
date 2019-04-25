package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GakpabsadwController {

    private final GakpabsadwService gakpabsadwService;

    public GakpabsadwController(GakpabsadwService gakpabsadwService) {
        this.gakpabsadwService = gakpabsadwService;
    }

    @RequestMapping("/gakpabsadw")
    public String index() {
        return gakpabsadwService.getGreeting();
    }

}
