package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QrkxdxhdbkController {

    private final QrkxdxhdbkService qrkxdxhdbkService;

    public QrkxdxhdbkController(QrkxdxhdbkService qrkxdxhdbkService) {
        this.qrkxdxhdbkService = qrkxdxhdbkService;
    }

    @RequestMapping("/qrkxdxhdbk")
    public String index() {
        return qrkxdxhdbkService.getGreeting();
    }

}
