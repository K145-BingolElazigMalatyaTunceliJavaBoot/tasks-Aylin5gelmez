package src.week3.greengrocer;

import src.week3.greengrocer.entities.Apple;
import src.week3.greengrocer.entities.Cherry;
import src.week3.greengrocer.entities.Fruit;
import src.week3.greengrocer.entities.Pear;
import src.week3.greengrocer.manager.FruitManager;

public class main {
    public static void main(String[] args) throws Exception {

        FruitManager fruitManager = new FruitManager();

        Apple apple =new Apple();
        Pear pear = new Pear();
        Cherry cherry=new Cherry();

        fruitManager.add(apple,50);
        fruitManager.add(pear,15);
        fruitManager.add(cherry,30);

        fruitManager.buyFruit(apple,30);
        fruitManager.buyFruit(pear,25);
        fruitManager.buyFruit(cherry,40);

        
    }
}
