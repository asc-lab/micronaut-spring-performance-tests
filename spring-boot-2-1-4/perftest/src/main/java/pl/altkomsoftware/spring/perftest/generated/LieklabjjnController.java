package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LieklabjjnController {

    private final LieklabjjnService lieklabjjnService;

    public LieklabjjnController(LieklabjjnService lieklabjjnService) {
        this.lieklabjjnService = lieklabjjnService;
    }

    @RequestMapping("/lieklabjjn")
    public String index() {
        return lieklabjjnService.getGreeting();
    }

}
