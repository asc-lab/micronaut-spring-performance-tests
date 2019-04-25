package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PlsxnrswcvController {

    private final PlsxnrswcvService plsxnrswcvService;

    public PlsxnrswcvController(PlsxnrswcvService plsxnrswcvService) {
        this.plsxnrswcvService = plsxnrswcvService;
    }

    @RequestMapping("/plsxnrswcv")
    public String index() {
        return plsxnrswcvService.getGreeting();
    }

}
