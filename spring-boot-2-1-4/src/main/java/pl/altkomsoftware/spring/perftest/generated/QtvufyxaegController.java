package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QtvufyxaegController {

    private final QtvufyxaegService qtvufyxaegService;

    public QtvufyxaegController(QtvufyxaegService qtvufyxaegService) {
        this.qtvufyxaegService = qtvufyxaegService;
    }

    @RequestMapping("/qtvufyxaeg")
    public String index() {
        return qtvufyxaegService.getGreeting();
    }

}
