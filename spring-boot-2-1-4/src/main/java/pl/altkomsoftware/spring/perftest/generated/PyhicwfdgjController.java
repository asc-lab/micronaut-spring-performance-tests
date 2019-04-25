package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PyhicwfdgjController {

    private final PyhicwfdgjService pyhicwfdgjService;

    public PyhicwfdgjController(PyhicwfdgjService pyhicwfdgjService) {
        this.pyhicwfdgjService = pyhicwfdgjService;
    }

    @RequestMapping("/pyhicwfdgj")
    public String index() {
        return pyhicwfdgjService.getGreeting();
    }

}
