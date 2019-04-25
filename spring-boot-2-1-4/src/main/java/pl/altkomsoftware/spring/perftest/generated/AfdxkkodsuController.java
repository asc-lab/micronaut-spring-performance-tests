package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AfdxkkodsuController {

    private final AfdxkkodsuService afdxkkodsuService;

    public AfdxkkodsuController(AfdxkkodsuService afdxkkodsuService) {
        this.afdxkkodsuService = afdxkkodsuService;
    }

    @RequestMapping("/afdxkkodsu")
    public String index() {
        return afdxkkodsuService.getGreeting();
    }

}
