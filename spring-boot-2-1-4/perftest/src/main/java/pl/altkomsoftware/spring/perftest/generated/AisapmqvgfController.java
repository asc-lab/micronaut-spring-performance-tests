package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AisapmqvgfController {

    private final AisapmqvgfService aisapmqvgfService;

    public AisapmqvgfController(AisapmqvgfService aisapmqvgfService) {
        this.aisapmqvgfService = aisapmqvgfService;
    }

    @RequestMapping("/aisapmqvgf")
    public String index() {
        return aisapmqvgfService.getGreeting();
    }

}
