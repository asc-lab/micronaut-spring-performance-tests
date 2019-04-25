package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FuhowouksfController {

    private final FuhowouksfService fuhowouksfService;

    public FuhowouksfController(FuhowouksfService fuhowouksfService) {
        this.fuhowouksfService = fuhowouksfService;
    }

    @RequestMapping("/fuhowouksf")
    public String index() {
        return fuhowouksfService.getGreeting();
    }

}
