package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PuyrptjdvqController {

    private final PuyrptjdvqService puyrptjdvqService;

    public PuyrptjdvqController(PuyrptjdvqService puyrptjdvqService) {
        this.puyrptjdvqService = puyrptjdvqService;
    }

    @RequestMapping("/puyrptjdvq")
    public String index() {
        return puyrptjdvqService.getGreeting();
    }

}
