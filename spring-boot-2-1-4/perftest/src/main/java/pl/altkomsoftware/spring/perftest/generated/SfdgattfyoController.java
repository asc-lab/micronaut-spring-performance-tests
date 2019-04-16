package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SfdgattfyoController {

    private final SfdgattfyoService sfdgattfyoService;

    public SfdgattfyoController(SfdgattfyoService sfdgattfyoService) {
        this.sfdgattfyoService = sfdgattfyoService;
    }

    @RequestMapping("/sfdgattfyo")
    public String index() {
        return sfdgattfyoService.getGreeting();
    }

}
