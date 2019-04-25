package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UvpkrcxevfController {

    private final UvpkrcxevfService uvpkrcxevfService;

    public UvpkrcxevfController(UvpkrcxevfService uvpkrcxevfService) {
        this.uvpkrcxevfService = uvpkrcxevfService;
    }

    @RequestMapping("/uvpkrcxevf")
    public String index() {
        return uvpkrcxevfService.getGreeting();
    }

}
