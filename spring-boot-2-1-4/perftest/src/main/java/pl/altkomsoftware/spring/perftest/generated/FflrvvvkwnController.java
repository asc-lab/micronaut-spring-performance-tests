package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FflrvvvkwnController {

    private final FflrvvvkwnService fflrvvvkwnService;

    public FflrvvvkwnController(FflrvvvkwnService fflrvvvkwnService) {
        this.fflrvvvkwnService = fflrvvvkwnService;
    }

    @RequestMapping("/fflrvvvkwn")
    public String index() {
        return fflrvvvkwnService.getGreeting();
    }

}
