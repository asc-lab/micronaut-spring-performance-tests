package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GplwignlikController {

    private final GplwignlikService gplwignlikService;

    public GplwignlikController(GplwignlikService gplwignlikService) {
        this.gplwignlikService = gplwignlikService;
    }

    @RequestMapping("/gplwignlik")
    public String index() {
        return gplwignlikService.getGreeting();
    }

}
