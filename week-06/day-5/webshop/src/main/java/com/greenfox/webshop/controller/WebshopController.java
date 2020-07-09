package com.greenfox.webshop.controller;

import com.greenfox.webshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class WebshopController {

    int infiniteScrollCounter = 0;
    @GetMapping("/fetch")
    @ResponseBody
    public List<ShopItem> infiniteScroll() {
        infiniteScrollCounter += 20;
        return items.subList(infiniteScrollCounter, infiniteScrollCounter+20);
    }

    @GetMapping("/")
    public String show(Model model) {
        infiniteScrollCounter = 0;
        model.addAttribute("items", items.subList(0, 20));
        return "webshop";
    }

    @GetMapping("/only-available")
    public String showOnlyAvailable(Model model) {
        model.addAttribute("items",
                items.stream()
                        .filter(i -> i.getQuantityInStock() > 0)
                        .collect(Collectors.toList()));
        return "webshop";
    }

    @GetMapping("/cheapest-first")
    public String sortByLowestPrice(Model model) {
        model.addAttribute("items",
                items.stream()
                        .sorted(Comparator.comparing(ShopItem::getPrice))
                        .collect(Collectors.toList()));
        return "webshop";
    }

    @GetMapping("/contains-nike")
    public String showOnlyThingsContainingNike(Model model) {
        model.addAttribute("items",
                items.stream()
                        .filter(i -> i.getName().contains("Nike"))
                        .collect(Collectors.toList()));
        return "webshop";
    }

    @GetMapping("/average-stock")
    public String showAverageStock(Model model) {
        OptionalDouble total = items.stream()
                .mapToDouble(ShopItem::getQuantityInStock)
                .average();

        double totall = 0;

        if (total.isPresent()) {
            totall = total.getAsDouble();

            double oneDecimal = (double) Math.floor(totall * 10) / 10;
            model.addAttribute("avg", oneDecimal);
        }

        return "averagestock";
    }

    @GetMapping("/most-expensive")
    public String showMostExpensiveAvailable(Model model) {

        Optional<ShopItem> optionalShopItem = items.stream()
                .filter(i -> i.getQuantityInStock() > 0)
                .sorted((i1, i2) -> i2.getPrice().compareTo(i1.getPrice()))
                .collect(Collectors.toList()).stream()
                .findFirst();

        if (optionalShopItem.isPresent()) {
            ShopItem shopItem = optionalShopItem.get();
            model.addAttribute("items", shopItem);
        }

        return "webshop";
    }

    @PostMapping("/search")
    public String search(@RequestParam(value = "searchbar") String search, Model model) {
        model.addAttribute("items",
                items.stream()
                        .filter(i -> i.getName().toLowerCase().contains(search.toLowerCase()) || i.getDescription().toLowerCase().contains(search.toLowerCase()))
                        .collect(Collectors.toList()));
        return "webshop";
    }

    List<ShopItem> items = Arrays.asList(
            new ShopItem("Nike AirForce One", "Super duper COOL Nike shoes for everyone, in every size!", 119.99f, 52),
            new ShopItem("GTX 2070 Super OC 8GB Gaming GPU", "High end gaming GPU for 4K gaming!", 749.99f, 7),
            new ShopItem("AMD Ryzen 14800X 128 Core CPU", "128/256 Core/threads CPU with 12.5 GHZ ALL-CORE base clock speed, AM4 socket, 140W TDP", 449.99f, 38),
            new ShopItem("Vivian Vance premium bikini thong", "Black is the new Black, wanna be the best? Have the BEST!", 799.99f, 2),
            new ShopItem("18K GOLD stuffed Sateen pillow", "premium sateen pillow with gold lining, and gold stuffing, can be ordered in rose gold version!", 1099.99f, 5),
            new ShopItem("Coca Cola Vanilla", "Vanilla flavoured Coca Cola, ice cold refreshing!", 3.99f, 0),
            new ShopItem("Lamborghini Centenario", "C'mon this one doesn't need a description", 399989.99f, 0),
            new ShopItem("Lorem ipsum", "Lorem ipsum dolor sit amet for sale!", 500f, 2),
            new ShopItem("Lored mispum", "Lores mispum dolor sit amet for sale!", 30f, 56),
            new ShopItem("Forem dipsun", "Forem dispun dolor sit amet for sale!", 9999f, 0),
            new ShopItem("Nike AirForce One", "Super duper COOL Nike shoes for everyone, in every size!", 119.99f, 52),
            new ShopItem("GTX 2070 Super OC 8GB Gaming GPU", "High end gaming GPU for 4K gaming!", 749.99f, 7),
            new ShopItem("AMD Ryzen 14800X 128 Core CPU", "128/256 Core/threads CPU with 12.5 GHZ ALL-CORE base clock speed, AM4 socket, 140W TDP", 449.99f, 38),
            new ShopItem("Vivian Vance premium bikini thong", "Black is the new Black, wanna be the best? Have the BEST!", 799.99f, 2),
            new ShopItem("18K GOLD stuffed Sateen pillow", "premium sateen pillow with gold lining, and gold stuffing, can be ordered in rose gold version!", 1099.99f, 5),
            new ShopItem("Coca Cola Vanilla", "Vanilla flavoured Coca Cola, ice cold refreshing!", 3.99f, 0),
            new ShopItem("Lamborghini Centenario", "C'mon this one doesn't need a description", 399989.99f, 0),
            new ShopItem("Lorem ipsum", "Lorem ipsum dolor sit amet for sale!", 500f, 2),
            new ShopItem("Lored mispum", "Lores mispum dolor sit amet for sale!", 30f, 56),
            new ShopItem("Forem dipsun", "Forem dispun dolor sit amet for sale!", 9999f, 0),
            new ShopItem("Nike AirForce One", "Super duper COOL Nike shoes for everyone, in every size!", 119.99f, 52),
            new ShopItem("GTX 2070 Super OC 8GB Gaming GPU", "High end gaming GPU for 4K gaming!", 749.99f, 7),
            new ShopItem("AMD Ryzen 14800X 128 Core CPU", "128/256 Core/threads CPU with 12.5 GHZ ALL-CORE base clock speed, AM4 socket, 140W TDP", 449.99f, 38),
            new ShopItem("Vivian Vance premium bikini thong", "Black is the new Black, wanna be the best? Have the BEST!", 799.99f, 2),
            new ShopItem("18K GOLD stuffed Sateen pillow", "premium sateen pillow with gold lining, and gold stuffing, can be ordered in rose gold version!", 1099.99f, 5),
            new ShopItem("Coca Cola Vanilla", "Vanilla flavoured Coca Cola, ice cold refreshing!", 3.99f, 0),
            new ShopItem("Lamborghini Centenario", "C'mon this one doesn't need a description", 399989.99f, 0),
            new ShopItem("Lorem ipsum", "Lorem ipsum dolor sit amet for sale!", 500f, 2),
            new ShopItem("Lored mispum", "Lores mispum dolor sit amet for sale!", 30f, 56),
            new ShopItem("Forem dipsun", "Forem dispun dolor sit amet for sale!", 9999f, 0),
            new ShopItem("Nike AirForce One", "Super duper COOL Nike shoes for everyone, in every size!", 119.99f, 52),
            new ShopItem("GTX 2070 Super OC 8GB Gaming GPU", "High end gaming GPU for 4K gaming!", 749.99f, 7),
            new ShopItem("AMD Ryzen 14800X 128 Core CPU", "128/256 Core/threads CPU with 12.5 GHZ ALL-CORE base clock speed, AM4 socket, 140W TDP", 449.99f, 38),
            new ShopItem("Vivian Vance premium bikini thong", "Black is the new Black, wanna be the best? Have the BEST!", 799.99f, 2),
            new ShopItem("18K GOLD stuffed Sateen pillow", "premium sateen pillow with gold lining, and gold stuffing, can be ordered in rose gold version!", 1099.99f, 5),
            new ShopItem("Coca Cola Vanilla", "Vanilla flavoured Coca Cola, ice cold refreshing!", 3.99f, 0),
            new ShopItem("Lamborghini Centenario", "C'mon this one doesn't need a description", 399989.99f, 0),
            new ShopItem("Lorem ipsum", "Lorem ipsum dolor sit amet for sale!", 500f, 2),
            new ShopItem("Lored mispum", "Lores mispum dolor sit amet for sale!", 30f, 56),
            new ShopItem("Forem dipsun", "Forem dispun dolor sit amet for sale!", 9999f, 0),
            new ShopItem("Nike AirForce One", "Super duper COOL Nike shoes for everyone, in every size!", 119.99f, 52),
            new ShopItem("GTX 2070 Super OC 8GB Gaming GPU", "High end gaming GPU for 4K gaming!", 749.99f, 7),
            new ShopItem("AMD Ryzen 14800X 128 Core CPU", "128/256 Core/threads CPU with 12.5 GHZ ALL-CORE base clock speed, AM4 socket, 140W TDP", 449.99f, 38),
            new ShopItem("Vivian Vance premium bikini thong", "Black is the new Black, wanna be the best? Have the BEST!", 799.99f, 2),
            new ShopItem("18K GOLD stuffed Sateen pillow", "premium sateen pillow with gold lining, and gold stuffing, can be ordered in rose gold version!", 1099.99f, 5),
            new ShopItem("Coca Cola Vanilla", "Vanilla flavoured Coca Cola, ice cold refreshing!", 3.99f, 0),
            new ShopItem("Lamborghini Centenario", "C'mon this one doesn't need a description", 399989.99f, 0),
            new ShopItem("Lorem ipsum", "Lorem ipsum dolor sit amet for sale!", 500f, 2),
            new ShopItem("Lored mispum", "Lores mispum dolor sit amet for sale!", 30f, 56),
            new ShopItem("Forem dipsun", "Forem dispun dolor sit amet for sale!", 9999f, 0),
            new ShopItem("Nike AirForce One", "Super duper COOL Nike shoes for everyone, in every size!", 119.99f, 52),
            new ShopItem("GTX 2070 Super OC 8GB Gaming GPU", "High end gaming GPU for 4K gaming!", 749.99f, 7),
            new ShopItem("AMD Ryzen 14800X 128 Core CPU", "128/256 Core/threads CPU with 12.5 GHZ ALL-CORE base clock speed, AM4 socket, 140W TDP", 449.99f, 38),
            new ShopItem("Vivian Vance premium bikini thong", "Black is the new Black, wanna be the best? Have the BEST!", 799.99f, 2),
            new ShopItem("18K GOLD stuffed Sateen pillow", "premium sateen pillow with gold lining, and gold stuffing, can be ordered in rose gold version!", 1099.99f, 5),
            new ShopItem("Coca Cola Vanilla", "Vanilla flavoured Coca Cola, ice cold refreshing!", 3.99f, 0),
            new ShopItem("Lamborghini Centenario", "C'mon this one doesn't need a description", 399989.99f, 0),
            new ShopItem("Lorem ipsum", "Lorem ipsum dolor sit amet for sale!", 500f, 2),
            new ShopItem("Lored mispum", "Lores mispum dolor sit amet for sale!", 30f, 56),
            new ShopItem("Forem dipsun", "Forem dispun dolor sit amet for sale!", 9999f, 0),
            new ShopItem("Nike AirForce One", "Super duper COOL Nike shoes for everyone, in every size!", 119.99f, 52),
            new ShopItem("GTX 2070 Super OC 8GB Gaming GPU", "High end gaming GPU for 4K gaming!", 749.99f, 7),
            new ShopItem("AMD Ryzen 14800X 128 Core CPU", "128/256 Core/threads CPU with 12.5 GHZ ALL-CORE base clock speed, AM4 socket, 140W TDP", 449.99f, 38),
            new ShopItem("Vivian Vance premium bikini thong", "Black is the new Black, wanna be the best? Have the BEST!", 799.99f, 2),
            new ShopItem("18K GOLD stuffed Sateen pillow", "premium sateen pillow with gold lining, and gold stuffing, can be ordered in rose gold version!", 1099.99f, 5),
            new ShopItem("Coca Cola Vanilla", "Vanilla flavoured Coca Cola, ice cold refreshing!", 3.99f, 0),
            new ShopItem("Lamborghini Centenario", "C'mon this one doesn't need a description", 399989.99f, 0),
            new ShopItem("Lorem ipsum", "Lorem ipsum dolor sit amet for sale!", 500f, 2),
            new ShopItem("Lored mispum", "Lores mispum dolor sit amet for sale!", 30f, 56),
            new ShopItem("Forem dipsun", "Forem dispun dolor sit amet for sale!", 9999f, 0)
    );
}

//fetch js
//response body method ami vissszaadja a nyers json filet, a show method mellet
