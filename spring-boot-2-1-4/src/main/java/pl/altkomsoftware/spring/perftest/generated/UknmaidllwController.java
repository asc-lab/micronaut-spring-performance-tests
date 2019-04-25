package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UknmaidllwController {

    private final UknmaidllwService uknmaidllwService;

    public UknmaidllwController(UknmaidllwService uknmaidllwService) {
        this.uknmaidllwService = uknmaidllwService;
    }

    @RequestMapping("/uknmaidllw")
    public String index() {
        return uknmaidllwService.getGreeting();
    }

}
