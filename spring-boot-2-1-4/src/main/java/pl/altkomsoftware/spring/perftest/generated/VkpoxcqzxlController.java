package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VkpoxcqzxlController {

    private final VkpoxcqzxlService vkpoxcqzxlService;

    public VkpoxcqzxlController(VkpoxcqzxlService vkpoxcqzxlService) {
        this.vkpoxcqzxlService = vkpoxcqzxlService;
    }

    @RequestMapping("/vkpoxcqzxl")
    public String index() {
        return vkpoxcqzxlService.getGreeting();
    }

}
