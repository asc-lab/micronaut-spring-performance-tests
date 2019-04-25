package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NqvaliqdpeController {

    private final NqvaliqdpeService nqvaliqdpeService;

    public NqvaliqdpeController(NqvaliqdpeService nqvaliqdpeService) {
        this.nqvaliqdpeService = nqvaliqdpeService;
    }

    @RequestMapping("/nqvaliqdpe")
    public String index() {
        return nqvaliqdpeService.getGreeting();
    }

}
