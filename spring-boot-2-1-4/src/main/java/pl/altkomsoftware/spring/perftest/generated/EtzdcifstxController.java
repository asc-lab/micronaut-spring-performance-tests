package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EtzdcifstxController {

    private final EtzdcifstxService etzdcifstxService;

    public EtzdcifstxController(EtzdcifstxService etzdcifstxService) {
        this.etzdcifstxService = etzdcifstxService;
    }

    @RequestMapping("/etzdcifstx")
    public String index() {
        return etzdcifstxService.getGreeting();
    }

}
