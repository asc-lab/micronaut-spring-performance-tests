package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KeyjzcjgtfController {

    private final KeyjzcjgtfService keyjzcjgtfService;

    public KeyjzcjgtfController(KeyjzcjgtfService keyjzcjgtfService) {
        this.keyjzcjgtfService = keyjzcjgtfService;
    }

    @RequestMapping("/keyjzcjgtf")
    public String index() {
        return keyjzcjgtfService.getGreeting();
    }

}
