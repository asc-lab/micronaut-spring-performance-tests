package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XokbrgriujController {

    private final XokbrgriujService xokbrgriujService;

    public XokbrgriujController(XokbrgriujService xokbrgriujService) {
        this.xokbrgriujService = xokbrgriujService;
    }

    @RequestMapping("/xokbrgriuj")
    public String index() {
        return xokbrgriujService.getGreeting();
    }

}
