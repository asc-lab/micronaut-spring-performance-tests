package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SkttgazsvkController {

    private final SkttgazsvkService skttgazsvkService;

    public SkttgazsvkController(SkttgazsvkService skttgazsvkService) {
        this.skttgazsvkService = skttgazsvkService;
    }

    @RequestMapping("/skttgazsvk")
    public String index() {
        return skttgazsvkService.getGreeting();
    }

}
