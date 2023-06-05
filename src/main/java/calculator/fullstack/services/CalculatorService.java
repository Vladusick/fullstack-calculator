package calculator.fullstack.services;

import calculator.fullstack.dto.CalculatorDto;
import calculator.fullstack.entities.CalculatorEntity;
import calculator.fullstack.repositories.CalculatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {

    CalculatorRepository calculatorRepository;

    public CalculatorService(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

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

    public List<CalculatorEntity> findAll() {
        return calculatorRepository.findAll();
    }
}
