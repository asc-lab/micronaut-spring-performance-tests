package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FsypvbsvkzController {

    private final FsypvbsvkzService fsypvbsvkzService;

    public FsypvbsvkzController(FsypvbsvkzService fsypvbsvkzService) {
        this.fsypvbsvkzService = fsypvbsvkzService;
    }

    @RequestMapping("/fsypvbsvkz")
    public String index() {
        return fsypvbsvkzService.getGreeting();
    }

}
