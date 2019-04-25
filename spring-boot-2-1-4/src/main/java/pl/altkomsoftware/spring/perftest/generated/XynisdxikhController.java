package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XynisdxikhController {

    private final XynisdxikhService xynisdxikhService;

    public XynisdxikhController(XynisdxikhService xynisdxikhService) {
        this.xynisdxikhService = xynisdxikhService;
    }

    @RequestMapping("/xynisdxikh")
    public String index() {
        return xynisdxikhService.getGreeting();
    }

}
