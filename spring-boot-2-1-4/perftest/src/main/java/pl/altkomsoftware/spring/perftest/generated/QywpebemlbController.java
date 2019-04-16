package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QywpebemlbController {

    private final QywpebemlbService qywpebemlbService;

    public QywpebemlbController(QywpebemlbService qywpebemlbService) {
        this.qywpebemlbService = qywpebemlbService;
    }

    @RequestMapping("/qywpebemlb")
    public String index() {
        return qywpebemlbService.getGreeting();
    }

}
