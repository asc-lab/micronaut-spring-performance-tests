package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WabjersblzController {

    private final WabjersblzService wabjersblzService;

    public WabjersblzController(WabjersblzService wabjersblzService) {
        this.wabjersblzService = wabjersblzService;
    }

    @RequestMapping("/wabjersblz")
    public String index() {
        return wabjersblzService.getGreeting();
    }

}
