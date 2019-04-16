package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DyuzpqroajController {

    private final DyuzpqroajService dyuzpqroajService;

    public DyuzpqroajController(DyuzpqroajService dyuzpqroajService) {
        this.dyuzpqroajService = dyuzpqroajService;
    }

    @RequestMapping("/dyuzpqroaj")
    public String index() {
        return dyuzpqroajService.getGreeting();
    }

}
