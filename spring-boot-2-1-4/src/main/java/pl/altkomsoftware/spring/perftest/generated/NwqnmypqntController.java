package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NwqnmypqntController {

    private final NwqnmypqntService nwqnmypqntService;

    public NwqnmypqntController(NwqnmypqntService nwqnmypqntService) {
        this.nwqnmypqntService = nwqnmypqntService;
    }

    @RequestMapping("/nwqnmypqnt")
    public String index() {
        return nwqnmypqntService.getGreeting();
    }

}
