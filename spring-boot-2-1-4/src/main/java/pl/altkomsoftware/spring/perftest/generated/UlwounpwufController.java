package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UlwounpwufController {

    private final UlwounpwufService ulwounpwufService;

    public UlwounpwufController(UlwounpwufService ulwounpwufService) {
        this.ulwounpwufService = ulwounpwufService;
    }

    @RequestMapping("/ulwounpwuf")
    public String index() {
        return ulwounpwufService.getGreeting();
    }

}
