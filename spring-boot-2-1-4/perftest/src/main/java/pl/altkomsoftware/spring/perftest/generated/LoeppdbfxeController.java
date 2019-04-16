package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoeppdbfxeController {

    private final LoeppdbfxeService loeppdbfxeService;

    public LoeppdbfxeController(LoeppdbfxeService loeppdbfxeService) {
        this.loeppdbfxeService = loeppdbfxeService;
    }

    @RequestMapping("/loeppdbfxe")
    public String index() {
        return loeppdbfxeService.getGreeting();
    }

}
