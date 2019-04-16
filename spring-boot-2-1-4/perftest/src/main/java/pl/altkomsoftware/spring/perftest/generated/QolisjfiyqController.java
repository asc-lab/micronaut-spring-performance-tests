package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QolisjfiyqController {

    private final QolisjfiyqService qolisjfiyqService;

    public QolisjfiyqController(QolisjfiyqService qolisjfiyqService) {
        this.qolisjfiyqService = qolisjfiyqService;
    }

    @RequestMapping("/qolisjfiyq")
    public String index() {
        return qolisjfiyqService.getGreeting();
    }

}
