package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XfmuwvxbphController {

    private final XfmuwvxbphService xfmuwvxbphService;

    public XfmuwvxbphController(XfmuwvxbphService xfmuwvxbphService) {
        this.xfmuwvxbphService = xfmuwvxbphService;
    }

    @RequestMapping("/xfmuwvxbph")
    public String index() {
        return xfmuwvxbphService.getGreeting();
    }

}
