package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XcsqcfmawcController {

    private final XcsqcfmawcService xcsqcfmawcService;

    public XcsqcfmawcController(XcsqcfmawcService xcsqcfmawcService) {
        this.xcsqcfmawcService = xcsqcfmawcService;
    }

    @RequestMapping("/xcsqcfmawc")
    public String index() {
        return xcsqcfmawcService.getGreeting();
    }

}
