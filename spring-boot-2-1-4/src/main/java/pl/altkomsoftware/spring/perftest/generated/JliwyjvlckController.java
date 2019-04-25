package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JliwyjvlckController {

    private final JliwyjvlckService jliwyjvlckService;

    public JliwyjvlckController(JliwyjvlckService jliwyjvlckService) {
        this.jliwyjvlckService = jliwyjvlckService;
    }

    @RequestMapping("/jliwyjvlck")
    public String index() {
        return jliwyjvlckService.getGreeting();
    }

}
