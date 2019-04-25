package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CpfhnbghcfController {

    private final CpfhnbghcfService cpfhnbghcfService;

    public CpfhnbghcfController(CpfhnbghcfService cpfhnbghcfService) {
        this.cpfhnbghcfService = cpfhnbghcfService;
    }

    @RequestMapping("/cpfhnbghcf")
    public String index() {
        return cpfhnbghcfService.getGreeting();
    }

}
