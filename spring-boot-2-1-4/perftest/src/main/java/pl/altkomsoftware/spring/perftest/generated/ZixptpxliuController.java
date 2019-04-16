package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZixptpxliuController {

    private final ZixptpxliuService zixptpxliuService;

    public ZixptpxliuController(ZixptpxliuService zixptpxliuService) {
        this.zixptpxliuService = zixptpxliuService;
    }

    @RequestMapping("/zixptpxliu")
    public String index() {
        return zixptpxliuService.getGreeting();
    }

}
