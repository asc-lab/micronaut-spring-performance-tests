package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EvhfxqtxsvController {

    private final EvhfxqtxsvService evhfxqtxsvService;

    public EvhfxqtxsvController(EvhfxqtxsvService evhfxqtxsvService) {
        this.evhfxqtxsvService = evhfxqtxsvService;
    }

    @RequestMapping("/evhfxqtxsv")
    public String index() {
        return evhfxqtxsvService.getGreeting();
    }

}
