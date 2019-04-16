package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CyaugtfyogController {

    private final CyaugtfyogService cyaugtfyogService;

    public CyaugtfyogController(CyaugtfyogService cyaugtfyogService) {
        this.cyaugtfyogService = cyaugtfyogService;
    }

    @RequestMapping("/cyaugtfyog")
    public String index() {
        return cyaugtfyogService.getGreeting();
    }

}
