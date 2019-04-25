package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IpysfmfwkfController {

    private final IpysfmfwkfService ipysfmfwkfService;

    public IpysfmfwkfController(IpysfmfwkfService ipysfmfwkfService) {
        this.ipysfmfwkfService = ipysfmfwkfService;
    }

    @RequestMapping("/ipysfmfwkf")
    public String index() {
        return ipysfmfwkfService.getGreeting();
    }

}
