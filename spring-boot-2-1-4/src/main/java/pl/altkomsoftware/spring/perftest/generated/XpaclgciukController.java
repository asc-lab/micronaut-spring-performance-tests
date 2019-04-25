package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XpaclgciukController {

    private final XpaclgciukService xpaclgciukService;

    public XpaclgciukController(XpaclgciukService xpaclgciukService) {
        this.xpaclgciukService = xpaclgciukService;
    }

    @RequestMapping("/xpaclgciuk")
    public String index() {
        return xpaclgciukService.getGreeting();
    }

}
