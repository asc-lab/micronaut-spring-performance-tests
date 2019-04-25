package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UaybptgcumController {

    private final UaybptgcumService uaybptgcumService;

    public UaybptgcumController(UaybptgcumService uaybptgcumService) {
        this.uaybptgcumService = uaybptgcumService;
    }

    @RequestMapping("/uaybptgcum")
    public String index() {
        return uaybptgcumService.getGreeting();
    }

}
