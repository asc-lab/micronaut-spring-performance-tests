package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FtgbkbuoqiController {

    private final FtgbkbuoqiService ftgbkbuoqiService;

    public FtgbkbuoqiController(FtgbkbuoqiService ftgbkbuoqiService) {
        this.ftgbkbuoqiService = ftgbkbuoqiService;
    }

    @RequestMapping("/ftgbkbuoqi")
    public String index() {
        return ftgbkbuoqiService.getGreeting();
    }

}
