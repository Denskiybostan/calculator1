package Controller;

import Service.CalculatorService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    public final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }
    // /calculator/plus?num1=5
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из аргументов не передан";
        }
        return num1 + " - " + num2 + " = " + service.minus(num1, num2);
    }

    // /calculator/plus?num1=5
    public String multiply(Integer num1, Integer num2) {
        return num1 + " * " + num2 + " = " + service.multiply(num1,num2);
    }
    public String division(int num1, int num2) {
        try {
            if (num2 == 0) {
                return "На ноль делить нельзя";
            }
            return num1 + " / " + num2 + " = " + service.divide(num1, num2);
        } catch (IllegalArgumentException e) {
            System.out.println("На ноль делить нельзя, повторите снова");
        } finally {
        }
        return null;
    }
}
