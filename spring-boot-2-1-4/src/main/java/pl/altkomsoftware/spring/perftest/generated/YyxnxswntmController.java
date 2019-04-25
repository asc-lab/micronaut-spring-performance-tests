package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YyxnxswntmController {

    private final YyxnxswntmService yyxnxswntmService;

    public YyxnxswntmController(YyxnxswntmService yyxnxswntmService) {
        this.yyxnxswntmService = yyxnxswntmService;
    }

    @RequestMapping("/yyxnxswntm")
    public String index() {
        return yyxnxswntmService.getGreeting();
    }

}
