package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XaaieszbmcController {

    private final XaaieszbmcService xaaieszbmcService;

    public XaaieszbmcController(XaaieszbmcService xaaieszbmcService) {
        this.xaaieszbmcService = xaaieszbmcService;
    }

    @RequestMapping("/xaaieszbmc")
    public String index() {
        return xaaieszbmcService.getGreeting();
    }

}
