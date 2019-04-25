package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QebodrvijeController {

    private final QebodrvijeService qebodrvijeService;

    public QebodrvijeController(QebodrvijeService qebodrvijeService) {
        this.qebodrvijeService = qebodrvijeService;
    }

    @RequestMapping("/qebodrvije")
    public String index() {
        return qebodrvijeService.getGreeting();
    }

}
