package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IxzbbhsdlwController {

    private final IxzbbhsdlwService ixzbbhsdlwService;

    public IxzbbhsdlwController(IxzbbhsdlwService ixzbbhsdlwService) {
        this.ixzbbhsdlwService = ixzbbhsdlwService;
    }

    @RequestMapping("/ixzbbhsdlw")
    public String index() {
        return ixzbbhsdlwService.getGreeting();
    }

}
