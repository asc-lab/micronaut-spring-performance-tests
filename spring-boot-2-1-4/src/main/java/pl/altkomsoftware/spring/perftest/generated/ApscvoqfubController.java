package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApscvoqfubController {

    private final ApscvoqfubService apscvoqfubService;

    public ApscvoqfubController(ApscvoqfubService apscvoqfubService) {
        this.apscvoqfubService = apscvoqfubService;
    }

    @RequestMapping("/apscvoqfub")
    public String index() {
        return apscvoqfubService.getGreeting();
    }

}
