package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XqozykikvwController {

    private final XqozykikvwService xqozykikvwService;

    public XqozykikvwController(XqozykikvwService xqozykikvwService) {
        this.xqozykikvwService = xqozykikvwService;
    }

    @RequestMapping("/xqozykikvw")
    public String index() {
        return xqozykikvwService.getGreeting();
    }

}
