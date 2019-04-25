package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XzlghpazvqController {

    private final XzlghpazvqService xzlghpazvqService;

    public XzlghpazvqController(XzlghpazvqService xzlghpazvqService) {
        this.xzlghpazvqService = xzlghpazvqService;
    }

    @RequestMapping("/xzlghpazvq")
    public String index() {
        return xzlghpazvqService.getGreeting();
    }

}
