package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IghrypboywController {

    private final IghrypboywService ighrypboywService;

    public IghrypboywController(IghrypboywService ighrypboywService) {
        this.ighrypboywService = ighrypboywService;
    }

    @RequestMapping("/ighrypboyw")
    public String index() {
        return ighrypboywService.getGreeting();
    }

}
