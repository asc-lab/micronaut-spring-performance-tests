package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YieseuijyeController {

    private final YieseuijyeService yieseuijyeService;

    public YieseuijyeController(YieseuijyeService yieseuijyeService) {
        this.yieseuijyeService = yieseuijyeService;
    }

    @RequestMapping("/yieseuijye")
    public String index() {
        return yieseuijyeService.getGreeting();
    }

}
