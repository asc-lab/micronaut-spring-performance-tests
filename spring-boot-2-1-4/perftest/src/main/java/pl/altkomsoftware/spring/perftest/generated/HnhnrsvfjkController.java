package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HnhnrsvfjkController {

    private final HnhnrsvfjkService hnhnrsvfjkService;

    public HnhnrsvfjkController(HnhnrsvfjkService hnhnrsvfjkService) {
        this.hnhnrsvfjkService = hnhnrsvfjkService;
    }

    @RequestMapping("/hnhnrsvfjk")
    public String index() {
        return hnhnrsvfjkService.getGreeting();
    }

}
