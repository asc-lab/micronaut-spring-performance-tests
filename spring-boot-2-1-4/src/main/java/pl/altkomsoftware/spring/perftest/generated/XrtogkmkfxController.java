package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XrtogkmkfxController {

    private final XrtogkmkfxService xrtogkmkfxService;

    public XrtogkmkfxController(XrtogkmkfxService xrtogkmkfxService) {
        this.xrtogkmkfxService = xrtogkmkfxService;
    }

    @RequestMapping("/xrtogkmkfx")
    public String index() {
        return xrtogkmkfxService.getGreeting();
    }

}
