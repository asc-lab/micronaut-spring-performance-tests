package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yexwbjnsdh")
public class YexwbjnsdhController {

    private final YexwbjnsdhService yexwbjnsdhService;

    public YexwbjnsdhController(YexwbjnsdhService yexwbjnsdhService) {
        this.yexwbjnsdhService = yexwbjnsdhService;
    }

    @Get("/")
    public String index() {
        return yexwbjnsdhService.getGreeting();
    }
}
