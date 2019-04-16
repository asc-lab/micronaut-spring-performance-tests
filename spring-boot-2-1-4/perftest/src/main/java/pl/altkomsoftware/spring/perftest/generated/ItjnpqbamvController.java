package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ItjnpqbamvController {

    private final ItjnpqbamvService itjnpqbamvService;

    public ItjnpqbamvController(ItjnpqbamvService itjnpqbamvService) {
        this.itjnpqbamvService = itjnpqbamvService;
    }

    @RequestMapping("/itjnpqbamv")
    public String index() {
        return itjnpqbamvService.getGreeting();
    }

}
