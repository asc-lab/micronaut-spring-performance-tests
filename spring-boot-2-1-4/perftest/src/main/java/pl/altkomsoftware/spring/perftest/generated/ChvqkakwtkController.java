package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ChvqkakwtkController {

    private final ChvqkakwtkService chvqkakwtkService;

    public ChvqkakwtkController(ChvqkakwtkService chvqkakwtkService) {
        this.chvqkakwtkService = chvqkakwtkService;
    }

    @RequestMapping("/chvqkakwtk")
    public String index() {
        return chvqkakwtkService.getGreeting();
    }

}
