package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mqapebfycb")
public class MqapebfycbController {

    private final MqapebfycbService mqapebfycbService;

    public MqapebfycbController(MqapebfycbService mqapebfycbService) {
        this.mqapebfycbService = mqapebfycbService;
    }

    @Get("/")
    public String index() {
        return mqapebfycbService.getGreeting();
    }
}
