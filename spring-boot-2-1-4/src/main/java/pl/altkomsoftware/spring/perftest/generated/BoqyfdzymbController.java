package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BoqyfdzymbController {

    private final BoqyfdzymbService boqyfdzymbService;

    public BoqyfdzymbController(BoqyfdzymbService boqyfdzymbService) {
        this.boqyfdzymbService = boqyfdzymbService;
    }

    @RequestMapping("/boqyfdzymb")
    public String index() {
        return boqyfdzymbService.getGreeting();
    }

}
