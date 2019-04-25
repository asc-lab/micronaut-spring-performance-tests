package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DlnpkhhpvsController {

    private final DlnpkhhpvsService dlnpkhhpvsService;

    public DlnpkhhpvsController(DlnpkhhpvsService dlnpkhhpvsService) {
        this.dlnpkhhpvsService = dlnpkhhpvsService;
    }

    @RequestMapping("/dlnpkhhpvs")
    public String index() {
        return dlnpkhhpvsService.getGreeting();
    }

}
