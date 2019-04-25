package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MtrbqzvvwuController {

    private final MtrbqzvvwuService mtrbqzvvwuService;

    public MtrbqzvvwuController(MtrbqzvvwuService mtrbqzvvwuService) {
        this.mtrbqzvvwuService = mtrbqzvvwuService;
    }

    @RequestMapping("/mtrbqzvvwu")
    public String index() {
        return mtrbqzvvwuService.getGreeting();
    }

}
