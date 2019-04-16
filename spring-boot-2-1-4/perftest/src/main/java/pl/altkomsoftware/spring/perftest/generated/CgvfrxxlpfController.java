package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CgvfrxxlpfController {

    private final CgvfrxxlpfService cgvfrxxlpfService;

    public CgvfrxxlpfController(CgvfrxxlpfService cgvfrxxlpfService) {
        this.cgvfrxxlpfService = cgvfrxxlpfService;
    }

    @RequestMapping("/cgvfrxxlpf")
    public String index() {
        return cgvfrxxlpfService.getGreeting();
    }

}
