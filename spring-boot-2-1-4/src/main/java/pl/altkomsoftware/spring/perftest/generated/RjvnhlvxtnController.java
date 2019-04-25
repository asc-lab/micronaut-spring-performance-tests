package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RjvnhlvxtnController {

    private final RjvnhlvxtnService rjvnhlvxtnService;

    public RjvnhlvxtnController(RjvnhlvxtnService rjvnhlvxtnService) {
        this.rjvnhlvxtnService = rjvnhlvxtnService;
    }

    @RequestMapping("/rjvnhlvxtn")
    public String index() {
        return rjvnhlvxtnService.getGreeting();
    }

}
