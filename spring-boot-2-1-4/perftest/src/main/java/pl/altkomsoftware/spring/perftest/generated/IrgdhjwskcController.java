package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IrgdhjwskcController {

    private final IrgdhjwskcService irgdhjwskcService;

    public IrgdhjwskcController(IrgdhjwskcService irgdhjwskcService) {
        this.irgdhjwskcService = irgdhjwskcService;
    }

    @RequestMapping("/irgdhjwskc")
    public String index() {
        return irgdhjwskcService.getGreeting();
    }

}
