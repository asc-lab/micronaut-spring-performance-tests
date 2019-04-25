package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IpolqqevgpController {

    private final IpolqqevgpService ipolqqevgpService;

    public IpolqqevgpController(IpolqqevgpService ipolqqevgpService) {
        this.ipolqqevgpService = ipolqqevgpService;
    }

    @RequestMapping("/ipolqqevgp")
    public String index() {
        return ipolqqevgpService.getGreeting();
    }

}
