package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GvwczugqenController {

    private final GvwczugqenService gvwczugqenService;

    public GvwczugqenController(GvwczugqenService gvwczugqenService) {
        this.gvwczugqenService = gvwczugqenService;
    }

    @RequestMapping("/gvwczugqen")
    public String index() {
        return gvwczugqenService.getGreeting();
    }

}
