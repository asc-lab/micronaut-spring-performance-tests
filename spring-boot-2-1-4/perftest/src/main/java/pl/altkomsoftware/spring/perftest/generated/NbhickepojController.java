package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NbhickepojController {

    private final NbhickepojService nbhickepojService;

    public NbhickepojController(NbhickepojService nbhickepojService) {
        this.nbhickepojService = nbhickepojService;
    }

    @RequestMapping("/nbhickepoj")
    public String index() {
        return nbhickepojService.getGreeting();
    }

}
