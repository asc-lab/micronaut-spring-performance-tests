package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UovlpsehbvController {

    private final UovlpsehbvService uovlpsehbvService;

    public UovlpsehbvController(UovlpsehbvService uovlpsehbvService) {
        this.uovlpsehbvService = uovlpsehbvService;
    }

    @RequestMapping("/uovlpsehbv")
    public String index() {
        return uovlpsehbvService.getGreeting();
    }

}
