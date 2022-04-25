package pro.sky.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RequestMapping (path = "/order")
@RestController
public class ShopController {

    public final ShopServise shopServise;

    public ShopController(ShopServise shopServise) {
        this.shopServise = shopServise;
    }

    @GetMapping (path = "/add")
    public Map<String, Integer> add(@RequestParam(value = "id", required = false) String id) {
        return shopServise.add(id);
    }

    @GetMapping (path = "/get")
    public Map<String, Integer> get() {
        return shopServise.get();
    }
}
