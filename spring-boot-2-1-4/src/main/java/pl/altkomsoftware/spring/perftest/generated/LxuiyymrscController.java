package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LxuiyymrscController {

    private final LxuiyymrscService lxuiyymrscService;

    public LxuiyymrscController(LxuiyymrscService lxuiyymrscService) {
        this.lxuiyymrscService = lxuiyymrscService;
    }

    @RequestMapping("/lxuiyymrsc")
    public String index() {
        return lxuiyymrscService.getGreeting();
    }

}
