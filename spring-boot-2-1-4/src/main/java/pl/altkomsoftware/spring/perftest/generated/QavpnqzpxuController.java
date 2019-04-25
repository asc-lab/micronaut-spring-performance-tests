package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QavpnqzpxuController {

    private final QavpnqzpxuService qavpnqzpxuService;

    public QavpnqzpxuController(QavpnqzpxuService qavpnqzpxuService) {
        this.qavpnqzpxuService = qavpnqzpxuService;
    }

    @RequestMapping("/qavpnqzpxu")
    public String index() {
        return qavpnqzpxuService.getGreeting();
    }

}
