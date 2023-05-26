package calculator.fullstack.controllers;

import calculator.fullstack.dto.CalculatorDto;
import calculator.fullstack.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// доделать работу с базой, ексепшены, памминг из сущности в ДТОшку
// (required = false) - необязательный параметр делает, тру - делает обязательным, он по умолчаню тру

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
}
