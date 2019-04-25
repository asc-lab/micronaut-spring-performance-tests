package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LrriepsmojController {

    private final LrriepsmojService lrriepsmojService;

    public LrriepsmojController(LrriepsmojService lrriepsmojService) {
        this.lrriepsmojService = lrriepsmojService;
    }

    @RequestMapping("/lrriepsmoj")
    public String index() {
        return lrriepsmojService.getGreeting();
    }

}
