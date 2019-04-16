package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LxwzvdtsehController {

    private final LxwzvdtsehService lxwzvdtsehService;

    public LxwzvdtsehController(LxwzvdtsehService lxwzvdtsehService) {
        this.lxwzvdtsehService = lxwzvdtsehService;
    }

    @RequestMapping("/lxwzvdtseh")
    public String index() {
        return lxwzvdtsehService.getGreeting();
    }

}
