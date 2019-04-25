package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YhhxujrgoyController {

    private final YhhxujrgoyService yhhxujrgoyService;

    public YhhxujrgoyController(YhhxujrgoyService yhhxujrgoyService) {
        this.yhhxujrgoyService = yhhxujrgoyService;
    }

    @RequestMapping("/yhhxujrgoy")
    public String index() {
        return yhhxujrgoyService.getGreeting();
    }

}
