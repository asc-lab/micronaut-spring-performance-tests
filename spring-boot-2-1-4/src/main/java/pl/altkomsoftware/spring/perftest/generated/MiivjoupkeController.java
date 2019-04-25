package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiivjoupkeController {

    private final MiivjoupkeService miivjoupkeService;

    public MiivjoupkeController(MiivjoupkeService miivjoupkeService) {
        this.miivjoupkeService = miivjoupkeService;
    }

    @RequestMapping("/miivjoupke")
    public String index() {
        return miivjoupkeService.getGreeting();
    }

}
