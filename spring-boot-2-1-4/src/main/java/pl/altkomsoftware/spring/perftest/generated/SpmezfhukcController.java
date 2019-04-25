package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpmezfhukcController {

    private final SpmezfhukcService spmezfhukcService;

    public SpmezfhukcController(SpmezfhukcService spmezfhukcService) {
        this.spmezfhukcService = spmezfhukcService;
    }

    @RequestMapping("/spmezfhukc")
    public String index() {
        return spmezfhukcService.getGreeting();
    }

}
