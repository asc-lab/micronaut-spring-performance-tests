package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NwvnegihqdController {

    private final NwvnegihqdService nwvnegihqdService;

    public NwvnegihqdController(NwvnegihqdService nwvnegihqdService) {
        this.nwvnegihqdService = nwvnegihqdService;
    }

    @RequestMapping("/nwvnegihqd")
    public String index() {
        return nwvnegihqdService.getGreeting();
    }

}
