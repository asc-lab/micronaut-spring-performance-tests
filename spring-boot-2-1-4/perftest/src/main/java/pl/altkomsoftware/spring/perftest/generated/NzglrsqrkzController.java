package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NzglrsqrkzController {

    private final NzglrsqrkzService nzglrsqrkzService;

    public NzglrsqrkzController(NzglrsqrkzService nzglrsqrkzService) {
        this.nzglrsqrkzService = nzglrsqrkzService;
    }

    @RequestMapping("/nzglrsqrkz")
    public String index() {
        return nzglrsqrkzService.getGreeting();
    }

}
