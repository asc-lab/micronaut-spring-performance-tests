package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZebzhqdpoeController {

    private final ZebzhqdpoeService zebzhqdpoeService;

    public ZebzhqdpoeController(ZebzhqdpoeService zebzhqdpoeService) {
        this.zebzhqdpoeService = zebzhqdpoeService;
    }

    @RequestMapping("/zebzhqdpoe")
    public String index() {
        return zebzhqdpoeService.getGreeting();
    }

}
