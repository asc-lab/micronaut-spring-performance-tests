package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QnpomsndhcController {

    private final QnpomsndhcService qnpomsndhcService;

    public QnpomsndhcController(QnpomsndhcService qnpomsndhcService) {
        this.qnpomsndhcService = qnpomsndhcService;
    }

    @RequestMapping("/qnpomsndhc")
    public String index() {
        return qnpomsndhcService.getGreeting();
    }

}
