package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RyovfajrpcController {

    private final RyovfajrpcService ryovfajrpcService;

    public RyovfajrpcController(RyovfajrpcService ryovfajrpcService) {
        this.ryovfajrpcService = ryovfajrpcService;
    }

    @RequestMapping("/ryovfajrpc")
    public String index() {
        return ryovfajrpcService.getGreeting();
    }

}
