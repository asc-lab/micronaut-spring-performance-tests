package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KfvhuyryrnController {

    private final KfvhuyryrnService kfvhuyryrnService;

    public KfvhuyryrnController(KfvhuyryrnService kfvhuyryrnService) {
        this.kfvhuyryrnService = kfvhuyryrnService;
    }

    @RequestMapping("/kfvhuyryrn")
    public String index() {
        return kfvhuyryrnService.getGreeting();
    }

}
