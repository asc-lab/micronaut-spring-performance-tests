package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EvfyxmcxcxController {

    private final EvfyxmcxcxService evfyxmcxcxService;

    public EvfyxmcxcxController(EvfyxmcxcxService evfyxmcxcxService) {
        this.evfyxmcxcxService = evfyxmcxcxService;
    }

    @RequestMapping("/evfyxmcxcx")
    public String index() {
        return evfyxmcxcxService.getGreeting();
    }

}
