package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ItghnbjgfoController {

    private final ItghnbjgfoService itghnbjgfoService;

    public ItghnbjgfoController(ItghnbjgfoService itghnbjgfoService) {
        this.itghnbjgfoService = itghnbjgfoService;
    }

    @RequestMapping("/itghnbjgfo")
    public String index() {
        return itghnbjgfoService.getGreeting();
    }

}
