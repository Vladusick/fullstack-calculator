package calculator.fullstack.dto;

import calculator.fullstack.entities.CalculatorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculatorDto {

    //private int id;
    private int numberA;
    private int numberB;
    private String operationName;
    private int result;


    // с помощью этого констуктора мы задаем как будут мапиться сущьности из дто-шки
    // id нам не нужен, не передавай его на фронт. Или измени модель данных, чтобы отправлять его на фронт
    public CalculatorDto(CalculatorEntity calculatorEntity) {
        //this.id = calculatorEntity.getId();
        this.operationName = calculatorEntity.getOperation();
        this.result = calculatorEntity.getResult();
    }
}
