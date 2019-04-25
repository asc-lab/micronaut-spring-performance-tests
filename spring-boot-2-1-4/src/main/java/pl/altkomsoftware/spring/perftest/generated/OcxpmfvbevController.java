package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OcxpmfvbevController {

    private final OcxpmfvbevService ocxpmfvbevService;

    public OcxpmfvbevController(OcxpmfvbevService ocxpmfvbevService) {
        this.ocxpmfvbevService = ocxpmfvbevService;
    }

    @RequestMapping("/ocxpmfvbev")
    public String index() {
        return ocxpmfvbevService.getGreeting();
    }

}
