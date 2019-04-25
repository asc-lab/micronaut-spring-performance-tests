package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MohddbnukeController {

    private final MohddbnukeService mohddbnukeService;

    public MohddbnukeController(MohddbnukeService mohddbnukeService) {
        this.mohddbnukeService = mohddbnukeService;
    }

    @RequestMapping("/mohddbnuke")
    public String index() {
        return mohddbnukeService.getGreeting();
    }

}
