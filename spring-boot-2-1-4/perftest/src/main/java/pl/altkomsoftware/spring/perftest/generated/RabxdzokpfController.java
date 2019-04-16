package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RabxdzokpfController {

    private final RabxdzokpfService rabxdzokpfService;

    public RabxdzokpfController(RabxdzokpfService rabxdzokpfService) {
        this.rabxdzokpfService = rabxdzokpfService;
    }

    @RequestMapping("/rabxdzokpf")
    public String index() {
        return rabxdzokpfService.getGreeting();
    }

}
