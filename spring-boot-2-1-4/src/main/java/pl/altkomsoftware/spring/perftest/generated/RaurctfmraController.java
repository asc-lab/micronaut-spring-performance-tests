package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RaurctfmraController {

    private final RaurctfmraService raurctfmraService;

    public RaurctfmraController(RaurctfmraService raurctfmraService) {
        this.raurctfmraService = raurctfmraService;
    }

    @RequestMapping("/raurctfmra")
    public String index() {
        return raurctfmraService.getGreeting();
    }

}
