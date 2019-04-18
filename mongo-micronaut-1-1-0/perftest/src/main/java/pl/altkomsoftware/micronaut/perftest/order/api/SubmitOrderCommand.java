package pl.altkomsoftware.micronaut.perftest.order.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubmitOrderCommand {
    private UUID orderId;
}
