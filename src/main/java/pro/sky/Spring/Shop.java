package pro.sky.Spring;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Shop {

     HashMap<String, Integer> basket = new HashMap<>(

    );

    public HashMap<String, Integer> getBasket() {
        return basket;
    }

    public void setBasket(HashMap<String, Integer> basket) {
        this.basket = basket;
    }
}
