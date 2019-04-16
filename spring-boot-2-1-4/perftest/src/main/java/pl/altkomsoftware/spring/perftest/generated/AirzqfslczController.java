package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AirzqfslczController {

    private final AirzqfslczService airzqfslczService;

    public AirzqfslczController(AirzqfslczService airzqfslczService) {
        this.airzqfslczService = airzqfslczService;
    }

    @RequestMapping("/airzqfslcz")
    public String index() {
        return airzqfslczService.getGreeting();
    }

}
