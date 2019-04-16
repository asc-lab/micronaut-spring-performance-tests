package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UuivuzfslfController {

    private final UuivuzfslfService uuivuzfslfService;

    public UuivuzfslfController(UuivuzfslfService uuivuzfslfService) {
        this.uuivuzfslfService = uuivuzfslfService;
    }

    @RequestMapping("/uuivuzfslf")
    public String index() {
        return uuivuzfslfService.getGreeting();
    }

}
