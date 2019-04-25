package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VsayrkvxuuController {

    private final VsayrkvxuuService vsayrkvxuuService;

    public VsayrkvxuuController(VsayrkvxuuService vsayrkvxuuService) {
        this.vsayrkvxuuService = vsayrkvxuuService;
    }

    @RequestMapping("/vsayrkvxuu")
    public String index() {
        return vsayrkvxuuService.getGreeting();
    }

}
