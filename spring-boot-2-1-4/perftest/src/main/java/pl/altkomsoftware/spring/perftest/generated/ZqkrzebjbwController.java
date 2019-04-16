package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZqkrzebjbwController {

    private final ZqkrzebjbwService zqkrzebjbwService;

    public ZqkrzebjbwController(ZqkrzebjbwService zqkrzebjbwService) {
        this.zqkrzebjbwService = zqkrzebjbwService;
    }

    @RequestMapping("/zqkrzebjbw")
    public String index() {
        return zqkrzebjbwService.getGreeting();
    }

}
