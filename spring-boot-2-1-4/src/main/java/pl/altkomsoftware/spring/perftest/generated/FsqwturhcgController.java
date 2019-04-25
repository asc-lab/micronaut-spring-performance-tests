package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FsqwturhcgController {

    private final FsqwturhcgService fsqwturhcgService;

    public FsqwturhcgController(FsqwturhcgService fsqwturhcgService) {
        this.fsqwturhcgService = fsqwturhcgService;
    }

    @RequestMapping("/fsqwturhcg")
    public String index() {
        return fsqwturhcgService.getGreeting();
    }

}
