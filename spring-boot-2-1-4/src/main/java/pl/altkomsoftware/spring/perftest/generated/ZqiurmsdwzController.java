package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZqiurmsdwzController {

    private final ZqiurmsdwzService zqiurmsdwzService;

    public ZqiurmsdwzController(ZqiurmsdwzService zqiurmsdwzService) {
        this.zqiurmsdwzService = zqiurmsdwzService;
    }

    @RequestMapping("/zqiurmsdwz")
    public String index() {
        return zqiurmsdwzService.getGreeting();
    }

}
