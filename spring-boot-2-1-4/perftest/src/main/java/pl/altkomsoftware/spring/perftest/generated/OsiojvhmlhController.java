package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OsiojvhmlhController {

    private final OsiojvhmlhService osiojvhmlhService;

    public OsiojvhmlhController(OsiojvhmlhService osiojvhmlhService) {
        this.osiojvhmlhService = osiojvhmlhService;
    }

    @RequestMapping("/osiojvhmlh")
    public String index() {
        return osiojvhmlhService.getGreeting();
    }

}
