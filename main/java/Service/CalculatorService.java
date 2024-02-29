package Service;

import org.springframework.stereotype.Service;
@Service
public class CalculatorService {
        public int plus(Integer num1, Integer num2){
            checkNumbers(num1, num2);
            return num1 + num2;
        }

        public int minus(Integer num1, Integer num2) {
            checkNumbers(num1, num2);
            return num1 - num2;
        }
        public int multiply(Integer num1, Integer num2) {
            checkNumbers(num1, num2);
            return num1 * num2;

        }

        public int divide(Integer num1, Integer num2) {
            checkNumbers(num1, num2);
            checkDivide(num1, num2);
            return num1 / num2;
        }
        private void checkNumbers (Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new RuntimeException("Не все параметры указаны");
            }
        }
        private void checkDivide (Integer num1, Integer num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("Делить на ноль нельзя");
            }

        }

    }

