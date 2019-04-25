package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GtkxkgrktnController {

    private final GtkxkgrktnService gtkxkgrktnService;

    public GtkxkgrktnController(GtkxkgrktnService gtkxkgrktnService) {
        this.gtkxkgrktnService = gtkxkgrktnService;
    }

    @RequestMapping("/gtkxkgrktn")
    public String index() {
        return gtkxkgrktnService.getGreeting();
    }

}
