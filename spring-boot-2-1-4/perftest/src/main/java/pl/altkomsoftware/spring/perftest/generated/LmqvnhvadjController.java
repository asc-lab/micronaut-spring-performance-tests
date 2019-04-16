package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LmqvnhvadjController {

    private final LmqvnhvadjService lmqvnhvadjService;

    public LmqvnhvadjController(LmqvnhvadjService lmqvnhvadjService) {
        this.lmqvnhvadjService = lmqvnhvadjService;
    }

    @RequestMapping("/lmqvnhvadj")
    public String index() {
        return lmqvnhvadjService.getGreeting();
    }

}
