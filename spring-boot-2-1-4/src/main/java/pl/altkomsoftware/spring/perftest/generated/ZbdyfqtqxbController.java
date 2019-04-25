package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZbdyfqtqxbController {

    private final ZbdyfqtqxbService zbdyfqtqxbService;

    public ZbdyfqtqxbController(ZbdyfqtqxbService zbdyfqtqxbService) {
        this.zbdyfqtqxbService = zbdyfqtqxbService;
    }

    @RequestMapping("/zbdyfqtqxb")
    public String index() {
        return zbdyfqtqxbService.getGreeting();
    }

}
