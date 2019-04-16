package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VtgxjmgditController {

    private final VtgxjmgditService vtgxjmgditService;

    public VtgxjmgditController(VtgxjmgditService vtgxjmgditService) {
        this.vtgxjmgditService = vtgxjmgditService;
    }

    @RequestMapping("/vtgxjmgdit")
    public String index() {
        return vtgxjmgditService.getGreeting();
    }

}
