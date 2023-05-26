package calculator.fullstack.controllers;

import calculator.fullstack.dto.CalculatorDto;
import calculator.fullstack.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// todo
// доделать работу с базой, ексепшены, памминг из сущности в ДТОшку
// (required = false) - необязательный параметр делает, тру - делает обязательным, он по умолчаню тру
// сделать дробный, замеить интеджер на флоат или дабл
// деление на ноль исправить

@RestController
@RequestMapping("api/v1/")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public CalculatorDto addition(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.addition(a, b);
    }

    @GetMapping("/sub")
    public CalculatorDto subtraction(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.subtraction(a, b);
    }

    @GetMapping("/mul")
    public CalculatorDto multiplication(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.multiplication(a, b);
    }

    @GetMapping("/div")
    public CalculatorDto division(@RequestParam Integer a, @RequestParam Integer b) {
        return calculatorService.division(a, b);
    }
}
