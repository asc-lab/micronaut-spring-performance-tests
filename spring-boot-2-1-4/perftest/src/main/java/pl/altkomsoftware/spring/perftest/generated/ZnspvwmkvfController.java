package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZnspvwmkvfController {

    private final ZnspvwmkvfService znspvwmkvfService;

    public ZnspvwmkvfController(ZnspvwmkvfService znspvwmkvfService) {
        this.znspvwmkvfService = znspvwmkvfService;
    }

    @RequestMapping("/znspvwmkvf")
    public String index() {
        return znspvwmkvfService.getGreeting();
    }

}
