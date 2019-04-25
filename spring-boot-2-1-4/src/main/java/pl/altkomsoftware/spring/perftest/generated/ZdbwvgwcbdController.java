package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZdbwvgwcbdController {

    private final ZdbwvgwcbdService zdbwvgwcbdService;

    public ZdbwvgwcbdController(ZdbwvgwcbdService zdbwvgwcbdService) {
        this.zdbwvgwcbdService = zdbwvgwcbdService;
    }

    @RequestMapping("/zdbwvgwcbd")
    public String index() {
        return zdbwvgwcbdService.getGreeting();
    }

}
