package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OcxstsudkgController {

    private final OcxstsudkgService ocxstsudkgService;

    public OcxstsudkgController(OcxstsudkgService ocxstsudkgService) {
        this.ocxstsudkgService = ocxstsudkgService;
    }

    @RequestMapping("/ocxstsudkg")
    public String index() {
        return ocxstsudkgService.getGreeting();
    }

}
