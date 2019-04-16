package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KofkjnifvnController {

    private final KofkjnifvnService kofkjnifvnService;

    public KofkjnifvnController(KofkjnifvnService kofkjnifvnService) {
        this.kofkjnifvnService = kofkjnifvnService;
    }

    @RequestMapping("/kofkjnifvn")
    public String index() {
        return kofkjnifvnService.getGreeting();
    }

}
