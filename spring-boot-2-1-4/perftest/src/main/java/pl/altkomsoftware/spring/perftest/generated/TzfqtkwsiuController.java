package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TzfqtkwsiuController {

    private final TzfqtkwsiuService tzfqtkwsiuService;

    public TzfqtkwsiuController(TzfqtkwsiuService tzfqtkwsiuService) {
        this.tzfqtkwsiuService = tzfqtkwsiuService;
    }

    @RequestMapping("/tzfqtkwsiu")
    public String index() {
        return tzfqtkwsiuService.getGreeting();
    }

}
