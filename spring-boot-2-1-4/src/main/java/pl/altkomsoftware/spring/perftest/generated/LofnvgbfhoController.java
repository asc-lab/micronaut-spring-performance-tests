package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LofnvgbfhoController {

    private final LofnvgbfhoService lofnvgbfhoService;

    public LofnvgbfhoController(LofnvgbfhoService lofnvgbfhoService) {
        this.lofnvgbfhoService = lofnvgbfhoService;
    }

    @RequestMapping("/lofnvgbfho")
    public String index() {
        return lofnvgbfhoService.getGreeting();
    }

}
