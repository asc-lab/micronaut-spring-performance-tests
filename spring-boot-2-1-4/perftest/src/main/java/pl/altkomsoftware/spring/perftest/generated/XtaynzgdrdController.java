package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XtaynzgdrdController {

    private final XtaynzgdrdService xtaynzgdrdService;

    public XtaynzgdrdController(XtaynzgdrdService xtaynzgdrdService) {
        this.xtaynzgdrdService = xtaynzgdrdService;
    }

    @RequestMapping("/xtaynzgdrd")
    public String index() {
        return xtaynzgdrdService.getGreeting();
    }

}
