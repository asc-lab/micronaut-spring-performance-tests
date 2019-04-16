package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QpibrflcvaController {

    private final QpibrflcvaService qpibrflcvaService;

    public QpibrflcvaController(QpibrflcvaService qpibrflcvaService) {
        this.qpibrflcvaService = qpibrflcvaService;
    }

    @RequestMapping("/qpibrflcva")
    public String index() {
        return qpibrflcvaService.getGreeting();
    }

}
