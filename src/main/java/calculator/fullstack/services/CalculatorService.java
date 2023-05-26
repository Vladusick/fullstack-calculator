package calculator.fullstack.services;

import calculator.fullstack.dto.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    //тут потом заинжектить репу надо будет, когда буду делать подключение к базе

    public CalculatorDto addition(Integer a, Integer b) {
        return new CalculatorDto(a, b, "addition", a + b);
    }

    public CalculatorDto subtraction(Integer a, Integer b) {
        return new CalculatorDto(a, b, "subtraction", a - b);
    }

    public CalculatorDto multiplication(Integer a, Integer b) {
        return new CalculatorDto(a, b, "multiplication", a * b);
    }

    public CalculatorDto division(Integer a, Integer b) {
        return new CalculatorDto(a, b, "division", a / b);
    }
}
