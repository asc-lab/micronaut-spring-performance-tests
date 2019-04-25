package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YwnmicfdgrController {

    private final YwnmicfdgrService ywnmicfdgrService;

    public YwnmicfdgrController(YwnmicfdgrService ywnmicfdgrService) {
        this.ywnmicfdgrService = ywnmicfdgrService;
    }

    @RequestMapping("/ywnmicfdgr")
    public String index() {
        return ywnmicfdgrService.getGreeting();
    }

}
