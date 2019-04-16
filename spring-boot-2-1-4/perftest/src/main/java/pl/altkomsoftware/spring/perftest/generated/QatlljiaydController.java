package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QatlljiaydController {

    private final QatlljiaydService qatlljiaydService;

    public QatlljiaydController(QatlljiaydService qatlljiaydService) {
        this.qatlljiaydService = qatlljiaydService;
    }

    @RequestMapping("/qatlljiayd")
    public String index() {
        return qatlljiaydService.getGreeting();
    }

}
