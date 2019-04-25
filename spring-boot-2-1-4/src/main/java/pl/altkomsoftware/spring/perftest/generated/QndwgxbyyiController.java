package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QndwgxbyyiController {

    private final QndwgxbyyiService qndwgxbyyiService;

    public QndwgxbyyiController(QndwgxbyyiService qndwgxbyyiService) {
        this.qndwgxbyyiService = qndwgxbyyiService;
    }

    @RequestMapping("/qndwgxbyyi")
    public String index() {
        return qndwgxbyyiService.getGreeting();
    }

}
