package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CuaavcfvkvController {

    private final CuaavcfvkvService cuaavcfvkvService;

    public CuaavcfvkvController(CuaavcfvkvService cuaavcfvkvService) {
        this.cuaavcfvkvService = cuaavcfvkvService;
    }

    @RequestMapping("/cuaavcfvkv")
    public String index() {
        return cuaavcfvkvService.getGreeting();
    }

}
