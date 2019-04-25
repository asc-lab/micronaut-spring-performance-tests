package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VfdhawbrioController {

    private final VfdhawbrioService vfdhawbrioService;

    public VfdhawbrioController(VfdhawbrioService vfdhawbrioService) {
        this.vfdhawbrioService = vfdhawbrioService;
    }

    @RequestMapping("/vfdhawbrio")
    public String index() {
        return vfdhawbrioService.getGreeting();
    }

}
