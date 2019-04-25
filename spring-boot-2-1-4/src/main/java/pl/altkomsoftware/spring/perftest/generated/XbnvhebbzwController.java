package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XbnvhebbzwController {

    private final XbnvhebbzwService xbnvhebbzwService;

    public XbnvhebbzwController(XbnvhebbzwService xbnvhebbzwService) {
        this.xbnvhebbzwService = xbnvhebbzwService;
    }

    @RequestMapping("/xbnvhebbzw")
    public String index() {
        return xbnvhebbzwService.getGreeting();
    }

}
