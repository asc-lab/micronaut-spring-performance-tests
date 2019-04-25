package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FendzjhpooController {

    private final FendzjhpooService fendzjhpooService;

    public FendzjhpooController(FendzjhpooService fendzjhpooService) {
        this.fendzjhpooService = fendzjhpooService;
    }

    @RequestMapping("/fendzjhpoo")
    public String index() {
        return fendzjhpooService.getGreeting();
    }

}
