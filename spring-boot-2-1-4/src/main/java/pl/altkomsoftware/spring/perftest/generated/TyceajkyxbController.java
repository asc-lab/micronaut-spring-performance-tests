package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TyceajkyxbController {

    private final TyceajkyxbService tyceajkyxbService;

    public TyceajkyxbController(TyceajkyxbService tyceajkyxbService) {
        this.tyceajkyxbService = tyceajkyxbService;
    }

    @RequestMapping("/tyceajkyxb")
    public String index() {
        return tyceajkyxbService.getGreeting();
    }

}
