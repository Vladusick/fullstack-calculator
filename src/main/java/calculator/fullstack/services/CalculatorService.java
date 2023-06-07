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

    public CalculatorEntity addition(Integer a, Integer b) {
        CalculatorEntity calculatorEntity = new CalculatorEntity(a, b, "addition", a + b);
        calculatorRepository.save(calculatorEntity);
        return calculatorEntity;
    }

    public CalculatorEntity subtraction(Integer a, Integer b) {
        CalculatorEntity calculatorEntity = new CalculatorEntity(a, b, "subtraction", a - b);
        calculatorRepository.save(calculatorEntity);
        return calculatorEntity;
    }

    public CalculatorEntity multiplication(Integer a, Integer b) {
        CalculatorEntity calculatorEntity = new CalculatorEntity(a, b, "multiplication", a * b);
        calculatorRepository.save(calculatorEntity);
        return calculatorEntity;
    }

    public CalculatorEntity division(Integer a, Integer b) {
        CalculatorEntity calculatorEntity = new CalculatorEntity(a, b, "division", a / b);
        calculatorRepository.save(calculatorEntity);
        return calculatorEntity;
    }

    public List<CalculatorEntity> findAll() {
        return calculatorRepository.findAll();
    }
}
