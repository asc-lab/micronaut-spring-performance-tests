package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YkrexjlyijController {

    private final YkrexjlyijService ykrexjlyijService;

    public YkrexjlyijController(YkrexjlyijService ykrexjlyijService) {
        this.ykrexjlyijService = ykrexjlyijService;
    }

    @RequestMapping("/ykrexjlyij")
    public String index() {
        return ykrexjlyijService.getGreeting();
    }

}
