package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WorofadvxoController {

    private final WorofadvxoService worofadvxoService;

    public WorofadvxoController(WorofadvxoService worofadvxoService) {
        this.worofadvxoService = worofadvxoService;
    }

    @RequestMapping("/worofadvxo")
    public String index() {
        return worofadvxoService.getGreeting();
    }

}
