package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KwlaychxrlController {

    private final KwlaychxrlService kwlaychxrlService;

    public KwlaychxrlController(KwlaychxrlService kwlaychxrlService) {
        this.kwlaychxrlService = kwlaychxrlService;
    }

    @RequestMapping("/kwlaychxrl")
    public String index() {
        return kwlaychxrlService.getGreeting();
    }

}
