package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QubqwglrovController {

    private final QubqwglrovService qubqwglrovService;

    public QubqwglrovController(QubqwglrovService qubqwglrovService) {
        this.qubqwglrovService = qubqwglrovService;
    }

    @RequestMapping("/qubqwglrov")
    public String index() {
        return qubqwglrovService.getGreeting();
    }

}
