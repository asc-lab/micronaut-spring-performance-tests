package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DgjagusbltController {

    private final DgjagusbltService dgjagusbltService;

    public DgjagusbltController(DgjagusbltService dgjagusbltService) {
        this.dgjagusbltService = dgjagusbltService;
    }

    @RequestMapping("/dgjagusblt")
    public String index() {
        return dgjagusbltService.getGreeting();
    }

}
