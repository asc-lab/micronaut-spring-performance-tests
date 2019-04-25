package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XvhioxhqtlController {

    private final XvhioxhqtlService xvhioxhqtlService;

    public XvhioxhqtlController(XvhioxhqtlService xvhioxhqtlService) {
        this.xvhioxhqtlService = xvhioxhqtlService;
    }

    @RequestMapping("/xvhioxhqtl")
    public String index() {
        return xvhioxhqtlService.getGreeting();
    }

}
