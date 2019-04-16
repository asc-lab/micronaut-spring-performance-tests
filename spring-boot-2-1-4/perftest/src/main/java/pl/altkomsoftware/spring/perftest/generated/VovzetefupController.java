package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VovzetefupController {

    private final VovzetefupService vovzetefupService;

    public VovzetefupController(VovzetefupService vovzetefupService) {
        this.vovzetefupService = vovzetefupService;
    }

    @RequestMapping("/vovzetefup")
    public String index() {
        return vovzetefupService.getGreeting();
    }

}
