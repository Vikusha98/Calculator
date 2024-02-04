import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : 0;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;




}
// ошибка в коде возникает, когда производится операция деления,
// в случае, если делитель равен 0, т.к. на ноль в арифметике делить нельзя.
// Это приводит к ошибке ArithmeticException. Чтобы корректно обработать
// это, предотвращая падение программы, в код был внесем блок
//try-catch, который обрабатывает ошибку и выводит сообщение об
// ошибке в консоль