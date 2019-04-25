package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FscsycpbrmController {

    private final FscsycpbrmService fscsycpbrmService;

    public FscsycpbrmController(FscsycpbrmService fscsycpbrmService) {
        this.fscsycpbrmService = fscsycpbrmService;
    }

    @RequestMapping("/fscsycpbrm")
    public String index() {
        return fscsycpbrmService.getGreeting();
    }

}
