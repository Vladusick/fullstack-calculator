package calculator.fullstack.services;

import calculator.fullstack.dto.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public CalculatorDto addition(Integer a, Integer b) {
        return new CalculatorDto(a, b, "addition", a + b);
    }
}
