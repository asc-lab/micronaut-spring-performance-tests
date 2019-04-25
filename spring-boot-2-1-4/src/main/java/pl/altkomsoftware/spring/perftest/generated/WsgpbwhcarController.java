package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WsgpbwhcarController {

    private final WsgpbwhcarService wsgpbwhcarService;

    public WsgpbwhcarController(WsgpbwhcarService wsgpbwhcarService) {
        this.wsgpbwhcarService = wsgpbwhcarService;
    }

    @RequestMapping("/wsgpbwhcar")
    public String index() {
        return wsgpbwhcarService.getGreeting();
    }

}
