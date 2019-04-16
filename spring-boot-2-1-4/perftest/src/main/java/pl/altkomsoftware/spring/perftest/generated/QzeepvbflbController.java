package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QzeepvbflbController {

    private final QzeepvbflbService qzeepvbflbService;

    public QzeepvbflbController(QzeepvbflbService qzeepvbflbService) {
        this.qzeepvbflbService = qzeepvbflbService;
    }

    @RequestMapping("/qzeepvbflb")
    public String index() {
        return qzeepvbflbService.getGreeting();
    }

}
