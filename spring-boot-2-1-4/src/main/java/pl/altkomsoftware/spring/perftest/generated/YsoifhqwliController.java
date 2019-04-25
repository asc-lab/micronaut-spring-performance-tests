package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YsoifhqwliController {

    private final YsoifhqwliService ysoifhqwliService;

    public YsoifhqwliController(YsoifhqwliService ysoifhqwliService) {
        this.ysoifhqwliService = ysoifhqwliService;
    }

    @RequestMapping("/ysoifhqwli")
    public String index() {
        return ysoifhqwliService.getGreeting();
    }

}
