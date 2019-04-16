package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XbljbjbsnyController {

    private final XbljbjbsnyService xbljbjbsnyService;

    public XbljbjbsnyController(XbljbjbsnyService xbljbjbsnyService) {
        this.xbljbjbsnyService = xbljbjbsnyService;
    }

    @RequestMapping("/xbljbjbsny")
    public String index() {
        return xbljbjbsnyService.getGreeting();
    }

}
