package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HslcsxmvzdController {

    private final HslcsxmvzdService hslcsxmvzdService;

    public HslcsxmvzdController(HslcsxmvzdService hslcsxmvzdService) {
        this.hslcsxmvzdService = hslcsxmvzdService;
    }

    @RequestMapping("/hslcsxmvzd")
    public String index() {
        return hslcsxmvzdService.getGreeting();
    }

}
