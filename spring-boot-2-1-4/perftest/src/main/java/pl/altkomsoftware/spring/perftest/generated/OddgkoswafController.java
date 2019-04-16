package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OddgkoswafController {

    private final OddgkoswafService oddgkoswafService;

    public OddgkoswafController(OddgkoswafService oddgkoswafService) {
        this.oddgkoswafService = oddgkoswafService;
    }

    @RequestMapping("/oddgkoswaf")
    public String index() {
        return oddgkoswafService.getGreeting();
    }

}
