package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XglduetxoxController {

    private final XglduetxoxService xglduetxoxService;

    public XglduetxoxController(XglduetxoxService xglduetxoxService) {
        this.xglduetxoxService = xglduetxoxService;
    }

    @RequestMapping("/xglduetxox")
    public String index() {
        return xglduetxoxService.getGreeting();
    }

}
