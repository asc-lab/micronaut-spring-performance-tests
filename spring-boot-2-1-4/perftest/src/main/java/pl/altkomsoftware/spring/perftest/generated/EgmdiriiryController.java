package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EgmdiriiryController {

    private final EgmdiriiryService egmdiriiryService;

    public EgmdiriiryController(EgmdiriiryService egmdiriiryService) {
        this.egmdiriiryService = egmdiriiryService;
    }

    @RequestMapping("/egmdiriiry")
    public String index() {
        return egmdiriiryService.getGreeting();
    }

}
