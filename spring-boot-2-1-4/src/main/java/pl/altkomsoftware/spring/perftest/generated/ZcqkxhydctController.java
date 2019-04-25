package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZcqkxhydctController {

    private final ZcqkxhydctService zcqkxhydctService;

    public ZcqkxhydctController(ZcqkxhydctService zcqkxhydctService) {
        this.zcqkxhydctService = zcqkxhydctService;
    }

    @RequestMapping("/zcqkxhydct")
    public String index() {
        return zcqkxhydctService.getGreeting();
    }

}
