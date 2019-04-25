package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QhszabcslfController {

    private final QhszabcslfService qhszabcslfService;

    public QhszabcslfController(QhszabcslfService qhszabcslfService) {
        this.qhszabcslfService = qhszabcslfService;
    }

    @RequestMapping("/qhszabcslf")
    public String index() {
        return qhszabcslfService.getGreeting();
    }

}
