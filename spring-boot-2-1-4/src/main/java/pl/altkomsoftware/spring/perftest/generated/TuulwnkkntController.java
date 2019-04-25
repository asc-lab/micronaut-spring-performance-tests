package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TuulwnkkntController {

    private final TuulwnkkntService tuulwnkkntService;

    public TuulwnkkntController(TuulwnkkntService tuulwnkkntService) {
        this.tuulwnkkntService = tuulwnkkntService;
    }

    @RequestMapping("/tuulwnkknt")
    public String index() {
        return tuulwnkkntService.getGreeting();
    }

}
