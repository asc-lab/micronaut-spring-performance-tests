package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TdozcqvdziController {

    private final TdozcqvdziService tdozcqvdziService;

    public TdozcqvdziController(TdozcqvdziService tdozcqvdziService) {
        this.tdozcqvdziService = tdozcqvdziService;
    }

    @RequestMapping("/tdozcqvdzi")
    public String index() {
        return tdozcqvdziService.getGreeting();
    }

}
