package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YvqtxhfjmfController {

    private final YvqtxhfjmfService yvqtxhfjmfService;

    public YvqtxhfjmfController(YvqtxhfjmfService yvqtxhfjmfService) {
        this.yvqtxhfjmfService = yvqtxhfjmfService;
    }

    @RequestMapping("/yvqtxhfjmf")
    public String index() {
        return yvqtxhfjmfService.getGreeting();
    }

}
