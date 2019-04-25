package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RjixihuqobController {

    private final RjixihuqobService rjixihuqobService;

    public RjixihuqobController(RjixihuqobService rjixihuqobService) {
        this.rjixihuqobService = rjixihuqobService;
    }

    @RequestMapping("/rjixihuqob")
    public String index() {
        return rjixihuqobService.getGreeting();
    }

}
