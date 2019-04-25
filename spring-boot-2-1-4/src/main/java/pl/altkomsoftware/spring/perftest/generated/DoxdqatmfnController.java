package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DoxdqatmfnController {

    private final DoxdqatmfnService doxdqatmfnService;

    public DoxdqatmfnController(DoxdqatmfnService doxdqatmfnService) {
        this.doxdqatmfnService = doxdqatmfnService;
    }

    @RequestMapping("/doxdqatmfn")
    public String index() {
        return doxdqatmfnService.getGreeting();
    }

}
