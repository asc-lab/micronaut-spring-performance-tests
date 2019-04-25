package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YkvlnkftenController {

    private final YkvlnkftenService ykvlnkftenService;

    public YkvlnkftenController(YkvlnkftenService ykvlnkftenService) {
        this.ykvlnkftenService = ykvlnkftenService;
    }

    @RequestMapping("/ykvlnkften")
    public String index() {
        return ykvlnkftenService.getGreeting();
    }

}
