package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AifrvcwzodController {

    private final AifrvcwzodService aifrvcwzodService;

    public AifrvcwzodController(AifrvcwzodService aifrvcwzodService) {
        this.aifrvcwzodService = aifrvcwzodService;
    }

    @RequestMapping("/aifrvcwzod")
    public String index() {
        return aifrvcwzodService.getGreeting();
    }

}
