package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OhnqakyxlqController {

    private final OhnqakyxlqService ohnqakyxlqService;

    public OhnqakyxlqController(OhnqakyxlqService ohnqakyxlqService) {
        this.ohnqakyxlqService = ohnqakyxlqService;
    }

    @RequestMapping("/ohnqakyxlq")
    public String index() {
        return ohnqakyxlqService.getGreeting();
    }

}
