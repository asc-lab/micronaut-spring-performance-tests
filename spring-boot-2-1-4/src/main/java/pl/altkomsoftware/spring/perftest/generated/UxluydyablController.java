package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UxluydyablController {

    private final UxluydyablService uxluydyablService;

    public UxluydyablController(UxluydyablService uxluydyablService) {
        this.uxluydyablService = uxluydyablService;
    }

    @RequestMapping("/uxluydyabl")
    public String index() {
        return uxluydyablService.getGreeting();
    }

}
