package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NbknxmdgivController {

    private final NbknxmdgivService nbknxmdgivService;

    public NbknxmdgivController(NbknxmdgivService nbknxmdgivService) {
        this.nbknxmdgivService = nbknxmdgivService;
    }

    @RequestMapping("/nbknxmdgiv")
    public String index() {
        return nbknxmdgivService.getGreeting();
    }

}
