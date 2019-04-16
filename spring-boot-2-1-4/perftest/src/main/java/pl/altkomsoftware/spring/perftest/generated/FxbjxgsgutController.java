package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FxbjxgsgutController {

    private final FxbjxgsgutService fxbjxgsgutService;

    public FxbjxgsgutController(FxbjxgsgutService fxbjxgsgutService) {
        this.fxbjxgsgutService = fxbjxgsgutService;
    }

    @RequestMapping("/fxbjxgsgut")
    public String index() {
        return fxbjxgsgutService.getGreeting();
    }

}
