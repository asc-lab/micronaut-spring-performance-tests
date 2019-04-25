package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QdtnualcocController {

    private final QdtnualcocService qdtnualcocService;

    public QdtnualcocController(QdtnualcocService qdtnualcocService) {
        this.qdtnualcocService = qdtnualcocService;
    }

    @RequestMapping("/qdtnualcoc")
    public String index() {
        return qdtnualcocService.getGreeting();
    }

}
