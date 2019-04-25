package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QacftivjqqController {

    private final QacftivjqqService qacftivjqqService;

    public QacftivjqqController(QacftivjqqService qacftivjqqService) {
        this.qacftivjqqService = qacftivjqqService;
    }

    @RequestMapping("/qacftivjqq")
    public String index() {
        return qacftivjqqService.getGreeting();
    }

}
