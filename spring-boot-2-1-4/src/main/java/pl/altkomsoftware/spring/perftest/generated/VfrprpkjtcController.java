package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VfrprpkjtcController {

    private final VfrprpkjtcService vfrprpkjtcService;

    public VfrprpkjtcController(VfrprpkjtcService vfrprpkjtcService) {
        this.vfrprpkjtcService = vfrprpkjtcService;
    }

    @RequestMapping("/vfrprpkjtc")
    public String index() {
        return vfrprpkjtcService.getGreeting();
    }

}
