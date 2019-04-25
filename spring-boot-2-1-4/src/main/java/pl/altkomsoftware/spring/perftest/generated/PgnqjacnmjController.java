package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PgnqjacnmjController {

    private final PgnqjacnmjService pgnqjacnmjService;

    public PgnqjacnmjController(PgnqjacnmjService pgnqjacnmjService) {
        this.pgnqjacnmjService = pgnqjacnmjService;
    }

    @RequestMapping("/pgnqjacnmj")
    public String index() {
        return pgnqjacnmjService.getGreeting();
    }

}
