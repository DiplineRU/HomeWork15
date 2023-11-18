package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public Number plus(Integer a, Integer b) {
        return a.doubleValue() + b.doubleValue();
    }

    public Number minus(Integer a, Integer b) {
        return a.doubleValue() - b.doubleValue();
    }

    public Number multiply(Integer a, Integer b) {
        return a.doubleValue() * b.doubleValue();
    }

    public Number divide(Integer a, Integer b) {
        return a.doubleValue() / b.doubleValue();
    }

}
