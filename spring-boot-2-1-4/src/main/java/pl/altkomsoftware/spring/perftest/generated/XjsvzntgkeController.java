package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XjsvzntgkeController {

    private final XjsvzntgkeService xjsvzntgkeService;

    public XjsvzntgkeController(XjsvzntgkeService xjsvzntgkeService) {
        this.xjsvzntgkeService = xjsvzntgkeService;
    }

    @RequestMapping("/xjsvzntgke")
    public String index() {
        return xjsvzntgkeService.getGreeting();
    }

}
