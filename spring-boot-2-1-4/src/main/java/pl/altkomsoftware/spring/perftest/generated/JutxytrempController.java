package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JutxytrempController {

    private final JutxytrempService jutxytrempService;

    public JutxytrempController(JutxytrempService jutxytrempService) {
        this.jutxytrempService = jutxytrempService;
    }

    @RequestMapping("/jutxytremp")
    public String index() {
        return jutxytrempService.getGreeting();
    }

}
