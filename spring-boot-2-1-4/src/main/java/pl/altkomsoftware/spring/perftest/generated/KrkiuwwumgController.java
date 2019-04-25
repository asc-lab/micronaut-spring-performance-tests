package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KrkiuwwumgController {

    private final KrkiuwwumgService krkiuwwumgService;

    public KrkiuwwumgController(KrkiuwwumgService krkiuwwumgService) {
        this.krkiuwwumgService = krkiuwwumgService;
    }

    @RequestMapping("/krkiuwwumg")
    public String index() {
        return krkiuwwumgService.getGreeting();
    }

}
