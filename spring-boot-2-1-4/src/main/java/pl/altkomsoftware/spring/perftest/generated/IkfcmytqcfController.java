package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IkfcmytqcfController {

    private final IkfcmytqcfService ikfcmytqcfService;

    public IkfcmytqcfController(IkfcmytqcfService ikfcmytqcfService) {
        this.ikfcmytqcfService = ikfcmytqcfService;
    }

    @RequestMapping("/ikfcmytqcf")
    public String index() {
        return ikfcmytqcfService.getGreeting();
    }

}
