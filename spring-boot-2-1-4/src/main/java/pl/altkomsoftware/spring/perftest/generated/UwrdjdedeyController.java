package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UwrdjdedeyController {

    private final UwrdjdedeyService uwrdjdedeyService;

    public UwrdjdedeyController(UwrdjdedeyService uwrdjdedeyService) {
        this.uwrdjdedeyService = uwrdjdedeyService;
    }

    @RequestMapping("/uwrdjdedey")
    public String index() {
        return uwrdjdedeyService.getGreeting();
    }

}
