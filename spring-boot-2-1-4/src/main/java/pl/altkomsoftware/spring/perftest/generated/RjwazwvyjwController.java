package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RjwazwvyjwController {

    private final RjwazwvyjwService rjwazwvyjwService;

    public RjwazwvyjwController(RjwazwvyjwService rjwazwvyjwService) {
        this.rjwazwvyjwService = rjwazwvyjwService;
    }

    @RequestMapping("/rjwazwvyjw")
    public String index() {
        return rjwazwvyjwService.getGreeting();
    }

}
