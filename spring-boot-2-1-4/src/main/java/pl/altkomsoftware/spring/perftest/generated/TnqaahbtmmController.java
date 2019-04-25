package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TnqaahbtmmController {

    private final TnqaahbtmmService tnqaahbtmmService;

    public TnqaahbtmmController(TnqaahbtmmService tnqaahbtmmService) {
        this.tnqaahbtmmService = tnqaahbtmmService;
    }

    @RequestMapping("/tnqaahbtmm")
    public String index() {
        return tnqaahbtmmService.getGreeting();
    }

}
