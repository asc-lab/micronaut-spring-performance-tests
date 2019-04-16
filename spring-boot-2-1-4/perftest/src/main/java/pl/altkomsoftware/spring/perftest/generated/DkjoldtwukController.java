package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DkjoldtwukController {

    private final DkjoldtwukService dkjoldtwukService;

    public DkjoldtwukController(DkjoldtwukService dkjoldtwukService) {
        this.dkjoldtwukService = dkjoldtwukService;
    }

    @RequestMapping("/dkjoldtwuk")
    public String index() {
        return dkjoldtwukService.getGreeting();
    }

}
