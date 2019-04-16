package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OgooitpphoController {

    private final OgooitpphoService ogooitpphoService;

    public OgooitpphoController(OgooitpphoService ogooitpphoService) {
        this.ogooitpphoService = ogooitpphoService;
    }

    @RequestMapping("/ogooitppho")
    public String index() {
        return ogooitpphoService.getGreeting();
    }

}
