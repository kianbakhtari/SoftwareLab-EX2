package calculator;

import java.util.Objects;

public class Calculator {
    public double reverse(int a){
        return (double) 1/a;
    }

    public double square(int a){
        return Math.sqrt(a);
    }

    public double calculate(int input, String opt){
        if (Objects.equals(opt, "rvs")){
            return reverse(input); 
        } else if (Objects.equals(opt, "sqr")) {
            return square(input);
        } else{
            return 0.0;
        }
    }
}
