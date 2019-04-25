package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UgtqfllylwController {

    private final UgtqfllylwService ugtqfllylwService;

    public UgtqfllylwController(UgtqfllylwService ugtqfllylwService) {
        this.ugtqfllylwService = ugtqfllylwService;
    }

    @RequestMapping("/ugtqfllylw")
    public String index() {
        return ugtqfllylwService.getGreeting();
    }

}
