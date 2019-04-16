package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NqzxfogbpfController {

    private final NqzxfogbpfService nqzxfogbpfService;

    public NqzxfogbpfController(NqzxfogbpfService nqzxfogbpfService) {
        this.nqzxfogbpfService = nqzxfogbpfService;
    }

    @RequestMapping("/nqzxfogbpf")
    public String index() {
        return nqzxfogbpfService.getGreeting();
    }

}
