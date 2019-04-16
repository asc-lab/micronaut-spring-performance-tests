package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QcmgoqpdozController {

    private final QcmgoqpdozService qcmgoqpdozService;

    public QcmgoqpdozController(QcmgoqpdozService qcmgoqpdozService) {
        this.qcmgoqpdozService = qcmgoqpdozService;
    }

    @RequestMapping("/qcmgoqpdoz")
    public String index() {
        return qcmgoqpdozService.getGreeting();
    }

}
