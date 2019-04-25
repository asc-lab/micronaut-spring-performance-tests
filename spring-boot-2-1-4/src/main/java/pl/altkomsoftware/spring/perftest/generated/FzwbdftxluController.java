package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FzwbdftxluController {

    private final FzwbdftxluService fzwbdftxluService;

    public FzwbdftxluController(FzwbdftxluService fzwbdftxluService) {
        this.fzwbdftxluService = fzwbdftxluService;
    }

    @RequestMapping("/fzwbdftxlu")
    public String index() {
        return fzwbdftxluService.getGreeting();
    }

}
