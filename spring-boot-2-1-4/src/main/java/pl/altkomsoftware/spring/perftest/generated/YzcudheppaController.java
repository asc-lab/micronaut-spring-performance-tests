package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YzcudheppaController {

    private final YzcudheppaService yzcudheppaService;

    public YzcudheppaController(YzcudheppaService yzcudheppaService) {
        this.yzcudheppaService = yzcudheppaService;
    }

    @RequestMapping("/yzcudheppa")
    public String index() {
        return yzcudheppaService.getGreeting();
    }

}
