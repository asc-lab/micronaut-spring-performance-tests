package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VwfkcluhqfController {

    private final VwfkcluhqfService vwfkcluhqfService;

    public VwfkcluhqfController(VwfkcluhqfService vwfkcluhqfService) {
        this.vwfkcluhqfService = vwfkcluhqfService;
    }

    @RequestMapping("/vwfkcluhqf")
    public String index() {
        return vwfkcluhqfService.getGreeting();
    }

}
