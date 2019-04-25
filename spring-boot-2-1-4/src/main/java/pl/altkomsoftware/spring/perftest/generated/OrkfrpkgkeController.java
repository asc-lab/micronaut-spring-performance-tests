package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OrkfrpkgkeController {

    private final OrkfrpkgkeService orkfrpkgkeService;

    public OrkfrpkgkeController(OrkfrpkgkeService orkfrpkgkeService) {
        this.orkfrpkgkeService = orkfrpkgkeService;
    }

    @RequestMapping("/orkfrpkgke")
    public String index() {
        return orkfrpkgkeService.getGreeting();
    }

}
