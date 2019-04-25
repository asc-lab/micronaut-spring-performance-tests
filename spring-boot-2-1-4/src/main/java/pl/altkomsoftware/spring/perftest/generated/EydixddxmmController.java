package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EydixddxmmController {

    private final EydixddxmmService eydixddxmmService;

    public EydixddxmmController(EydixddxmmService eydixddxmmService) {
        this.eydixddxmmService = eydixddxmmService;
    }

    @RequestMapping("/eydixddxmm")
    public String index() {
        return eydixddxmmService.getGreeting();
    }

}
