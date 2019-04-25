package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BqropbdkxgController {

    private final BqropbdkxgService bqropbdkxgService;

    public BqropbdkxgController(BqropbdkxgService bqropbdkxgService) {
        this.bqropbdkxgService = bqropbdkxgService;
    }

    @RequestMapping("/bqropbdkxg")
    public String index() {
        return bqropbdkxgService.getGreeting();
    }

}
