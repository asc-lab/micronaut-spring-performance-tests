package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FzzvyuizesController {

    private final FzzvyuizesService fzzvyuizesService;

    public FzzvyuizesController(FzzvyuizesService fzzvyuizesService) {
        this.fzzvyuizesService = fzzvyuizesService;
    }

    @RequestMapping("/fzzvyuizes")
    public String index() {
        return fzzvyuizesService.getGreeting();
    }

}
