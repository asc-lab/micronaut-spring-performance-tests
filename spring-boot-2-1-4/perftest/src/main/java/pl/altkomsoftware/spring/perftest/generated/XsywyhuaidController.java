package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XsywyhuaidController {

    private final XsywyhuaidService xsywyhuaidService;

    public XsywyhuaidController(XsywyhuaidService xsywyhuaidService) {
        this.xsywyhuaidService = xsywyhuaidService;
    }

    @RequestMapping("/xsywyhuaid")
    public String index() {
        return xsywyhuaidService.getGreeting();
    }

}
