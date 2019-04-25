package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QhkmxmmdrsController {

    private final QhkmxmmdrsService qhkmxmmdrsService;

    public QhkmxmmdrsController(QhkmxmmdrsService qhkmxmmdrsService) {
        this.qhkmxmmdrsService = qhkmxmmdrsService;
    }

    @RequestMapping("/qhkmxmmdrs")
    public String index() {
        return qhkmxmmdrsService.getGreeting();
    }

}
