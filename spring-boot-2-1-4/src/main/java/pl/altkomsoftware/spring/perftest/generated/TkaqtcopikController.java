package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TkaqtcopikController {

    private final TkaqtcopikService tkaqtcopikService;

    public TkaqtcopikController(TkaqtcopikService tkaqtcopikService) {
        this.tkaqtcopikService = tkaqtcopikService;
    }

    @RequestMapping("/tkaqtcopik")
    public String index() {
        return tkaqtcopikService.getGreeting();
    }

}
