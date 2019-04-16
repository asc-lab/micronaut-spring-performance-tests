package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IomgcyuhbzController {

    private final IomgcyuhbzService iomgcyuhbzService;

    public IomgcyuhbzController(IomgcyuhbzService iomgcyuhbzService) {
        this.iomgcyuhbzService = iomgcyuhbzService;
    }

    @RequestMapping("/iomgcyuhbz")
    public String index() {
        return iomgcyuhbzService.getGreeting();
    }

}
