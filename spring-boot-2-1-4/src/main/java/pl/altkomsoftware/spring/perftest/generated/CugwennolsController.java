package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CugwennolsController {

    private final CugwennolsService cugwennolsService;

    public CugwennolsController(CugwennolsService cugwennolsService) {
        this.cugwennolsService = cugwennolsService;
    }

    @RequestMapping("/cugwennols")
    public String index() {
        return cugwennolsService.getGreeting();
    }

}
