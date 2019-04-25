package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QtkboqhoyeController {

    private final QtkboqhoyeService qtkboqhoyeService;

    public QtkboqhoyeController(QtkboqhoyeService qtkboqhoyeService) {
        this.qtkboqhoyeService = qtkboqhoyeService;
    }

    @RequestMapping("/qtkboqhoye")
    public String index() {
        return qtkboqhoyeService.getGreeting();
    }

}
