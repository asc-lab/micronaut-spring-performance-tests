package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ObhuufsjewController {

    private final ObhuufsjewService obhuufsjewService;

    public ObhuufsjewController(ObhuufsjewService obhuufsjewService) {
        this.obhuufsjewService = obhuufsjewService;
    }

    @RequestMapping("/obhuufsjew")
    public String index() {
        return obhuufsjewService.getGreeting();
    }

}
