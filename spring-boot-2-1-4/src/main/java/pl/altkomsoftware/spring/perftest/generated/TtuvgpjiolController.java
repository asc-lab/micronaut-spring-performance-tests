package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TtuvgpjiolController {

    private final TtuvgpjiolService ttuvgpjiolService;

    public TtuvgpjiolController(TtuvgpjiolService ttuvgpjiolService) {
        this.ttuvgpjiolService = ttuvgpjiolService;
    }

    @RequestMapping("/ttuvgpjiol")
    public String index() {
        return ttuvgpjiolService.getGreeting();
    }

}
