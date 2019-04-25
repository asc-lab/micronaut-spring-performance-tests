package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KskjpyyxtjController {

    private final KskjpyyxtjService kskjpyyxtjService;

    public KskjpyyxtjController(KskjpyyxtjService kskjpyyxtjService) {
        this.kskjpyyxtjService = kskjpyyxtjService;
    }

    @RequestMapping("/kskjpyyxtj")
    public String index() {
        return kskjpyyxtjService.getGreeting();
    }

}
