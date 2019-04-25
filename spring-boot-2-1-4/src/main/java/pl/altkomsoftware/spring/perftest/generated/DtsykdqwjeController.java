package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DtsykdqwjeController {

    private final DtsykdqwjeService dtsykdqwjeService;

    public DtsykdqwjeController(DtsykdqwjeService dtsykdqwjeService) {
        this.dtsykdqwjeService = dtsykdqwjeService;
    }

    @RequestMapping("/dtsykdqwje")
    public String index() {
        return dtsykdqwjeService.getGreeting();
    }

}
