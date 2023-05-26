package calculator.fullstack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculatorDto {

    private int numberA;
    private int numberB;
    private String operationName;
    private int result;
}
