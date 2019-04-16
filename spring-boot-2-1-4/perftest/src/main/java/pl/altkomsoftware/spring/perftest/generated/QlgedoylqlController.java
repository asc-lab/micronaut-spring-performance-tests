package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QlgedoylqlController {

    private final QlgedoylqlService qlgedoylqlService;

    public QlgedoylqlController(QlgedoylqlService qlgedoylqlService) {
        this.qlgedoylqlService = qlgedoylqlService;
    }

    @RequestMapping("/qlgedoylql")
    public String index() {
        return qlgedoylqlService.getGreeting();
    }

}
