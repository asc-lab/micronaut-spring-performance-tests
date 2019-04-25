package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NqutdoolvfController {

    private final NqutdoolvfService nqutdoolvfService;

    public NqutdoolvfController(NqutdoolvfService nqutdoolvfService) {
        this.nqutdoolvfService = nqutdoolvfService;
    }

    @RequestMapping("/nqutdoolvf")
    public String index() {
        return nqutdoolvfService.getGreeting();
    }

}
