package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UmxzixctzbController {

    private final UmxzixctzbService umxzixctzbService;

    public UmxzixctzbController(UmxzixctzbService umxzixctzbService) {
        this.umxzixctzbService = umxzixctzbService;
    }

    @RequestMapping("/umxzixctzb")
    public String index() {
        return umxzixctzbService.getGreeting();
    }

}
