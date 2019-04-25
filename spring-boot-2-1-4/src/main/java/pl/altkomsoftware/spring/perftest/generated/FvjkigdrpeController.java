package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FvjkigdrpeController {

    private final FvjkigdrpeService fvjkigdrpeService;

    public FvjkigdrpeController(FvjkigdrpeService fvjkigdrpeService) {
        this.fvjkigdrpeService = fvjkigdrpeService;
    }

    @RequestMapping("/fvjkigdrpe")
    public String index() {
        return fvjkigdrpeService.getGreeting();
    }

}
