package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UfrigmxqxbController {

    private final UfrigmxqxbService ufrigmxqxbService;

    public UfrigmxqxbController(UfrigmxqxbService ufrigmxqxbService) {
        this.ufrigmxqxbService = ufrigmxqxbService;
    }

    @RequestMapping("/ufrigmxqxb")
    public String index() {
        return ufrigmxqxbService.getGreeting();
    }

}
