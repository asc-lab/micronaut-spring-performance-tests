package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PdrgbcudrjController {

    private final PdrgbcudrjService pdrgbcudrjService;

    public PdrgbcudrjController(PdrgbcudrjService pdrgbcudrjService) {
        this.pdrgbcudrjService = pdrgbcudrjService;
    }

    @RequestMapping("/pdrgbcudrj")
    public String index() {
        return pdrgbcudrjService.getGreeting();
    }

}
