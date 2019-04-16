package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OpvgskyyidController {

    private final OpvgskyyidService opvgskyyidService;

    public OpvgskyyidController(OpvgskyyidService opvgskyyidService) {
        this.opvgskyyidService = opvgskyyidService;
    }

    @RequestMapping("/opvgskyyid")
    public String index() {
        return opvgskyyidService.getGreeting();
    }

}
