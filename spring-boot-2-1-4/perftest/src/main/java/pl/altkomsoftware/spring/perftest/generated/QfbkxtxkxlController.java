package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QfbkxtxkxlController {

    private final QfbkxtxkxlService qfbkxtxkxlService;

    public QfbkxtxkxlController(QfbkxtxkxlService qfbkxtxkxlService) {
        this.qfbkxtxkxlService = qfbkxtxkxlService;
    }

    @RequestMapping("/qfbkxtxkxl")
    public String index() {
        return qfbkxtxkxlService.getGreeting();
    }

}
