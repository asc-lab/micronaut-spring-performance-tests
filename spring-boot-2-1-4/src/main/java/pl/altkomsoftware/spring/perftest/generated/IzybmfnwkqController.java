package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IzybmfnwkqController {

    private final IzybmfnwkqService izybmfnwkqService;

    public IzybmfnwkqController(IzybmfnwkqService izybmfnwkqService) {
        this.izybmfnwkqService = izybmfnwkqService;
    }

    @RequestMapping("/izybmfnwkq")
    public String index() {
        return izybmfnwkqService.getGreeting();
    }

}
