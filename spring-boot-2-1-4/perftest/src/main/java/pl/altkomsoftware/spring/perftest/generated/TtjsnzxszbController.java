package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TtjsnzxszbController {

    private final TtjsnzxszbService ttjsnzxszbService;

    public TtjsnzxszbController(TtjsnzxszbService ttjsnzxszbService) {
        this.ttjsnzxszbService = ttjsnzxszbService;
    }

    @RequestMapping("/ttjsnzxszb")
    public String index() {
        return ttjsnzxszbService.getGreeting();
    }

}
