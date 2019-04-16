package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WzuzvpofsdController {

    private final WzuzvpofsdService wzuzvpofsdService;

    public WzuzvpofsdController(WzuzvpofsdService wzuzvpofsdService) {
        this.wzuzvpofsdService = wzuzvpofsdService;
    }

    @RequestMapping("/wzuzvpofsd")
    public String index() {
        return wzuzvpofsdService.getGreeting();
    }

}
