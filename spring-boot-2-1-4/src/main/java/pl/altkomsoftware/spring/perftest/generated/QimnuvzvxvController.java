package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QimnuvzvxvController {

    private final QimnuvzvxvService qimnuvzvxvService;

    public QimnuvzvxvController(QimnuvzvxvService qimnuvzvxvService) {
        this.qimnuvzvxvService = qimnuvzvxvService;
    }

    @RequestMapping("/qimnuvzvxv")
    public String index() {
        return qimnuvzvxvService.getGreeting();
    }

}
