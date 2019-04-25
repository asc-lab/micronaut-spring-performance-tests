package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YfbvvnoukhController {

    private final YfbvvnoukhService yfbvvnoukhService;

    public YfbvvnoukhController(YfbvvnoukhService yfbvvnoukhService) {
        this.yfbvvnoukhService = yfbvvnoukhService;
    }

    @RequestMapping("/yfbvvnoukh")
    public String index() {
        return yfbvvnoukhService.getGreeting();
    }

}
