package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BzmfzhyiosController {

    private final BzmfzhyiosService bzmfzhyiosService;

    public BzmfzhyiosController(BzmfzhyiosService bzmfzhyiosService) {
        this.bzmfzhyiosService = bzmfzhyiosService;
    }

    @RequestMapping("/bzmfzhyios")
    public String index() {
        return bzmfzhyiosService.getGreeting();
    }

}
