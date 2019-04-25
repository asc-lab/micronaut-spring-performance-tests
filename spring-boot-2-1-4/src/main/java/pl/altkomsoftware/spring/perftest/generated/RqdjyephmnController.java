package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RqdjyephmnController {

    private final RqdjyephmnService rqdjyephmnService;

    public RqdjyephmnController(RqdjyephmnService rqdjyephmnService) {
        this.rqdjyephmnService = rqdjyephmnService;
    }

    @RequestMapping("/rqdjyephmn")
    public String index() {
        return rqdjyephmnService.getGreeting();
    }

}
