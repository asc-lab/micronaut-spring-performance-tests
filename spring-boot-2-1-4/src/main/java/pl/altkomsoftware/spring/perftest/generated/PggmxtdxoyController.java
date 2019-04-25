package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PggmxtdxoyController {

    private final PggmxtdxoyService pggmxtdxoyService;

    public PggmxtdxoyController(PggmxtdxoyService pggmxtdxoyService) {
        this.pggmxtdxoyService = pggmxtdxoyService;
    }

    @RequestMapping("/pggmxtdxoy")
    public String index() {
        return pggmxtdxoyService.getGreeting();
    }

}
