package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JjnzesexkoController {

    private final JjnzesexkoService jjnzesexkoService;

    public JjnzesexkoController(JjnzesexkoService jjnzesexkoService) {
        this.jjnzesexkoService = jjnzesexkoService;
    }

    @RequestMapping("/jjnzesexko")
    public String index() {
        return jjnzesexkoService.getGreeting();
    }

}
