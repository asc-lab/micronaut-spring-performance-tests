package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NbhldrncllController {

    private final NbhldrncllService nbhldrncllService;

    public NbhldrncllController(NbhldrncllService nbhldrncllService) {
        this.nbhldrncllService = nbhldrncllService;
    }

    @RequestMapping("/nbhldrncll")
    public String index() {
        return nbhldrncllService.getGreeting();
    }

}
