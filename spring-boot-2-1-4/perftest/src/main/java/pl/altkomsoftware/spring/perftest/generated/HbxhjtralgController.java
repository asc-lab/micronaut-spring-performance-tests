package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HbxhjtralgController {

    private final HbxhjtralgService hbxhjtralgService;

    public HbxhjtralgController(HbxhjtralgService hbxhjtralgService) {
        this.hbxhjtralgService = hbxhjtralgService;
    }

    @RequestMapping("/hbxhjtralg")
    public String index() {
        return hbxhjtralgService.getGreeting();
    }

}
