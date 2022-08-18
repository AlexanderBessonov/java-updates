package functionInterface;

import com.cydeo2.Apple;
import com.cydeo2.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };


        System.out.println("******************PREDICATE***********************");
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));//false




        System.out.println("******************CONSUMER************************");
    Consumer<Integer> display = i -> System.out.println(i);
    display.accept(10); // 10


        System.out.println("******************BE CONSUMER************************");
    BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
    addTwo.accept(1,2);// 1+2=3

        System.out.println("******************FUNCTION************************");
    Function<String, String> fun = s -> "Hello"+s;
        System.out.println(fun.apply("Cydeo"));//Hello Sydeo

        System.out.println("******************BE FUNCTION************************");
        BiFunction<Integer,Integer,Integer> func = ( x1,  x2)->x1+x2;
        System.out.println(func.apply(2,3));//3

        System.out.println("******************SUPPLIER************************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());//0.11302313954441134



}
}

