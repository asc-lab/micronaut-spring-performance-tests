package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NryoiblvelController {

    private final NryoiblvelService nryoiblvelService;

    public NryoiblvelController(NryoiblvelService nryoiblvelService) {
        this.nryoiblvelService = nryoiblvelService;
    }

    @RequestMapping("/nryoiblvel")
    public String index() {
        return nryoiblvelService.getGreeting();
    }

}
