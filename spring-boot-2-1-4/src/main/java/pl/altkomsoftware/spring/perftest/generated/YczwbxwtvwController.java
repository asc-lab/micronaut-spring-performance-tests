package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YczwbxwtvwController {

    private final YczwbxwtvwService yczwbxwtvwService;

    public YczwbxwtvwController(YczwbxwtvwService yczwbxwtvwService) {
        this.yczwbxwtvwService = yczwbxwtvwService;
    }

    @RequestMapping("/yczwbxwtvw")
    public String index() {
        return yczwbxwtvwService.getGreeting();
    }

}
