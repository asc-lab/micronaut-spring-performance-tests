package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZyhugulbzlController {

    private final ZyhugulbzlService zyhugulbzlService;

    public ZyhugulbzlController(ZyhugulbzlService zyhugulbzlService) {
        this.zyhugulbzlService = zyhugulbzlService;
    }

    @RequestMapping("/zyhugulbzl")
    public String index() {
        return zyhugulbzlService.getGreeting();
    }

}
