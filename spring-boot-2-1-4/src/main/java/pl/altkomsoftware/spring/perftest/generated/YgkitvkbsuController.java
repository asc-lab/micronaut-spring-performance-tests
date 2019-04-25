package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YgkitvkbsuController {

    private final YgkitvkbsuService ygkitvkbsuService;

    public YgkitvkbsuController(YgkitvkbsuService ygkitvkbsuService) {
        this.ygkitvkbsuService = ygkitvkbsuService;
    }

    @RequestMapping("/ygkitvkbsu")
    public String index() {
        return ygkitvkbsuService.getGreeting();
    }

}
