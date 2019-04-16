package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ChzbgzqmbiController {

    private final ChzbgzqmbiService chzbgzqmbiService;

    public ChzbgzqmbiController(ChzbgzqmbiService chzbgzqmbiService) {
        this.chzbgzqmbiService = chzbgzqmbiService;
    }

    @RequestMapping("/chzbgzqmbi")
    public String index() {
        return chzbgzqmbiService.getGreeting();
    }

}
