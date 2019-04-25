package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BlcacqahwbController {

    private final BlcacqahwbService blcacqahwbService;

    public BlcacqahwbController(BlcacqahwbService blcacqahwbService) {
        this.blcacqahwbService = blcacqahwbService;
    }

    @RequestMapping("/blcacqahwb")
    public String index() {
        return blcacqahwbService.getGreeting();
    }

}
