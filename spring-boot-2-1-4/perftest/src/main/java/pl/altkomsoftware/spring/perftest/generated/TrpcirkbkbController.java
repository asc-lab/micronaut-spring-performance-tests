package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TrpcirkbkbController {

    private final TrpcirkbkbService trpcirkbkbService;

    public TrpcirkbkbController(TrpcirkbkbService trpcirkbkbService) {
        this.trpcirkbkbService = trpcirkbkbService;
    }

    @RequestMapping("/trpcirkbkb")
    public String index() {
        return trpcirkbkbService.getGreeting();
    }

}
