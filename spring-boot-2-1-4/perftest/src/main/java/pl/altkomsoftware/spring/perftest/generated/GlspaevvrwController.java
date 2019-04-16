package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GlspaevvrwController {

    private final GlspaevvrwService glspaevvrwService;

    public GlspaevvrwController(GlspaevvrwService glspaevvrwService) {
        this.glspaevvrwService = glspaevvrwService;
    }

    @RequestMapping("/glspaevvrw")
    public String index() {
        return glspaevvrwService.getGreeting();
    }

}
