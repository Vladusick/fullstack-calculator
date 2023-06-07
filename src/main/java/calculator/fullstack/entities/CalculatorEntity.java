package calculator.fullstack.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "calculations")
public class CalculatorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "number_A")
    private Integer numberA;

    @Column(name = "number_B")
    private Integer numberB;

    @Column(name = "operation")
    private String operation;

    @Column(name = "result")
    private Integer result;

    @Column(name = "secret_key")
    private String secretKey;

    public CalculatorEntity(Integer numberA, Integer numberB, String operation, Integer result) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.operation = operation;
        this.result = result;
    }
}


