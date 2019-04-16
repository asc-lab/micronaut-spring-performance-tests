package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NmyvkmrjxrController {

    private final NmyvkmrjxrService nmyvkmrjxrService;

    public NmyvkmrjxrController(NmyvkmrjxrService nmyvkmrjxrService) {
        this.nmyvkmrjxrService = nmyvkmrjxrService;
    }

    @RequestMapping("/nmyvkmrjxr")
    public String index() {
        return nmyvkmrjxrService.getGreeting();
    }

}
