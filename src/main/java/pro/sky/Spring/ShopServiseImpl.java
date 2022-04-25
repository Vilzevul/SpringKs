package pro.sky.Spring;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShopServiseImpl implements ShopServise {
    private final Shop shop;

    public ShopServiseImpl(Shop shop) {
        this.shop = shop;
    }

    @Override
    public Map add(String id) {
        List<String> items = Arrays.asList(id.split(" "));
        for (String str : items) {

            if (shop.getBasket().containsKey(str)) {
                Integer i = shop.getBasket().get(str);
                i++;
                shop.getBasket().replace(str, i);
            } else
                shop.getBasket().put(str, 1);
        }
        return shop.getBasket();
    }

    @Override
    public Map get() {
        return shop.getBasket();
    }
}
