package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KcpjxjqznkController {

    private final KcpjxjqznkService kcpjxjqznkService;

    public KcpjxjqznkController(KcpjxjqznkService kcpjxjqznkService) {
        this.kcpjxjqznkService = kcpjxjqznkService;
    }

    @RequestMapping("/kcpjxjqznk")
    public String index() {
        return kcpjxjqznkService.getGreeting();
    }

}
