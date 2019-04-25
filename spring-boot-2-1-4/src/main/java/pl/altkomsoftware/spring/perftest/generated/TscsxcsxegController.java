package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TscsxcsxegController {

    private final TscsxcsxegService tscsxcsxegService;

    public TscsxcsxegController(TscsxcsxegService tscsxcsxegService) {
        this.tscsxcsxegService = tscsxcsxegService;
    }

    @RequestMapping("/tscsxcsxeg")
    public String index() {
        return tscsxcsxegService.getGreeting();
    }

}
