package co.develhope.deploy2.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BasicService {

    /**
     * A random sum between Integer
     * @return
     */
    public Integer getSum(){
        Random random = new Random();
        int number1 = random.nextInt(50);
        int number2 = random.nextInt(50);
        Integer sum = number1+number2;
        return sum;
    }
}
