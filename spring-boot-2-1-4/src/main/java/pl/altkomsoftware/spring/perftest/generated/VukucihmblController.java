package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VukucihmblController {

    private final VukucihmblService vukucihmblService;

    public VukucihmblController(VukucihmblService vukucihmblService) {
        this.vukucihmblService = vukucihmblService;
    }

    @RequestMapping("/vukucihmbl")
    public String index() {
        return vukucihmblService.getGreeting();
    }

}
