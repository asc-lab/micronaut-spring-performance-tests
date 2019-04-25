package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QpydzjbshlController {

    private final QpydzjbshlService qpydzjbshlService;

    public QpydzjbshlController(QpydzjbshlService qpydzjbshlService) {
        this.qpydzjbshlService = qpydzjbshlService;
    }

    @RequestMapping("/qpydzjbshl")
    public String index() {
        return qpydzjbshlService.getGreeting();
    }

}
