package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NpajyjnhbfController {

    private final NpajyjnhbfService npajyjnhbfService;

    public NpajyjnhbfController(NpajyjnhbfService npajyjnhbfService) {
        this.npajyjnhbfService = npajyjnhbfService;
    }

    @RequestMapping("/npajyjnhbf")
    public String index() {
        return npajyjnhbfService.getGreeting();
    }

}
