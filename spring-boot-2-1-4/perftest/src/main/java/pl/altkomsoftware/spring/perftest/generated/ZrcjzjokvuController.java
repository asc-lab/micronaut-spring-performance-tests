package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZrcjzjokvuController {

    private final ZrcjzjokvuService zrcjzjokvuService;

    public ZrcjzjokvuController(ZrcjzjokvuService zrcjzjokvuService) {
        this.zrcjzjokvuService = zrcjzjokvuService;
    }

    @RequestMapping("/zrcjzjokvu")
    public String index() {
        return zrcjzjokvuService.getGreeting();
    }

}
