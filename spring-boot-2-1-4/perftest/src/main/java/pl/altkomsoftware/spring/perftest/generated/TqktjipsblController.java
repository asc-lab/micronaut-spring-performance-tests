package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TqktjipsblController {

    private final TqktjipsblService tqktjipsblService;

    public TqktjipsblController(TqktjipsblService tqktjipsblService) {
        this.tqktjipsblService = tqktjipsblService;
    }

    @RequestMapping("/tqktjipsbl")
    public String index() {
        return tqktjipsblService.getGreeting();
    }

}
