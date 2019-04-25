package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ImbaovluqiController {

    private final ImbaovluqiService imbaovluqiService;

    public ImbaovluqiController(ImbaovluqiService imbaovluqiService) {
        this.imbaovluqiService = imbaovluqiService;
    }

    @RequestMapping("/imbaovluqi")
    public String index() {
        return imbaovluqiService.getGreeting();
    }

}
