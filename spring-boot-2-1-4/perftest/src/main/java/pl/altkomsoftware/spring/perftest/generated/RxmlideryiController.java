package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RxmlideryiController {

    private final RxmlideryiService rxmlideryiService;

    public RxmlideryiController(RxmlideryiService rxmlideryiService) {
        this.rxmlideryiService = rxmlideryiService;
    }

    @RequestMapping("/rxmlideryi")
    public String index() {
        return rxmlideryiService.getGreeting();
    }

}
