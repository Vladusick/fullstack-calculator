package calculator.fullstack.controllers;

import calculator.fullstack.dto.CalculatorDto;
import calculator.fullstack.entities.CalculatorEntity;
import calculator.fullstack.services.CalculatorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

// todo
// доделать ексепшены
// сделать дробный, замеить интеджер на флоат или дабл
// деление на ноль исправить
// добавить логгирование

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public CalculatorEntity addition(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.addition(a, b);
    }

    @GetMapping("/sub")
    public CalculatorEntity subtraction(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.subtraction(a, b);
    }

    @GetMapping("/mul")
    public CalculatorEntity multiplication(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.multiplication(a, b);
    }

    @GetMapping("/div")
    public CalculatorEntity division(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.division(a, b);
    }

    @GetMapping("/history")
    public List<CalculatorDto> getHistory() {
    return calculatorService.findAll()
            .stream()
            .map(c -> new CalculatorDto(c))
            .collect(Collectors.toList());
    }
}
