package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZqlxivnwhyController {

    private final ZqlxivnwhyService zqlxivnwhyService;

    public ZqlxivnwhyController(ZqlxivnwhyService zqlxivnwhyService) {
        this.zqlxivnwhyService = zqlxivnwhyService;
    }

    @RequestMapping("/zqlxivnwhy")
    public String index() {
        return zqlxivnwhyService.getGreeting();
    }

}
