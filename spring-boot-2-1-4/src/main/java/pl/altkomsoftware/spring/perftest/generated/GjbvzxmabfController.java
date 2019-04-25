package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GjbvzxmabfController {

    private final GjbvzxmabfService gjbvzxmabfService;

    public GjbvzxmabfController(GjbvzxmabfService gjbvzxmabfService) {
        this.gjbvzxmabfService = gjbvzxmabfService;
    }

    @RequestMapping("/gjbvzxmabf")
    public String index() {
        return gjbvzxmabfService.getGreeting();
    }

}
