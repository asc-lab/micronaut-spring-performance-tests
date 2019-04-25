package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QbjddasmboController {

    private final QbjddasmboService qbjddasmboService;

    public QbjddasmboController(QbjddasmboService qbjddasmboService) {
        this.qbjddasmboService = qbjddasmboService;
    }

    @RequestMapping("/qbjddasmbo")
    public String index() {
        return qbjddasmboService.getGreeting();
    }

}
