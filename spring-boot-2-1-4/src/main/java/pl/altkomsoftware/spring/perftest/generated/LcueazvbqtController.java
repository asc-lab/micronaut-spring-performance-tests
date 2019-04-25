package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LcueazvbqtController {

    private final LcueazvbqtService lcueazvbqtService;

    public LcueazvbqtController(LcueazvbqtService lcueazvbqtService) {
        this.lcueazvbqtService = lcueazvbqtService;
    }

    @RequestMapping("/lcueazvbqt")
    public String index() {
        return lcueazvbqtService.getGreeting();
    }

}
