package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UrjdybdtxsController {

    private final UrjdybdtxsService urjdybdtxsService;

    public UrjdybdtxsController(UrjdybdtxsService urjdybdtxsService) {
        this.urjdybdtxsService = urjdybdtxsService;
    }

    @RequestMapping("/urjdybdtxs")
    public String index() {
        return urjdybdtxsService.getGreeting();
    }

}
