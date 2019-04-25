package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GgymjeyfjcController {

    private final GgymjeyfjcService ggymjeyfjcService;

    public GgymjeyfjcController(GgymjeyfjcService ggymjeyfjcService) {
        this.ggymjeyfjcService = ggymjeyfjcService;
    }

    @RequestMapping("/ggymjeyfjc")
    public String index() {
        return ggymjeyfjcService.getGreeting();
    }

}
