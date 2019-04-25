package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DviszazbmqController {

    private final DviszazbmqService dviszazbmqService;

    public DviszazbmqController(DviszazbmqService dviszazbmqService) {
        this.dviszazbmqService = dviszazbmqService;
    }

    @RequestMapping("/dviszazbmq")
    public String index() {
        return dviszazbmqService.getGreeting();
    }

}
