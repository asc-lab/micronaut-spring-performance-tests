package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IwjachqffdController {

    private final IwjachqffdService iwjachqffdService;

    public IwjachqffdController(IwjachqffdService iwjachqffdService) {
        this.iwjachqffdService = iwjachqffdService;
    }

    @RequestMapping("/iwjachqffd")
    public String index() {
        return iwjachqffdService.getGreeting();
    }

}
