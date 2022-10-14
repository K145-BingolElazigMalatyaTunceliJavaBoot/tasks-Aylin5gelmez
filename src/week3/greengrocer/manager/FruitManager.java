package src.week3.greengrocer.manager;

import src.week3.greengrocer.entities.Fruit;

public class FruitManager {

  public void add(Fruit fruit,int kg){
      fruit.getKg();

  }
  public void buyFruit(Fruit fruit ,int kg) throws Exception{
      if (fruit.getKg() < kg){
          throw new Exception("Malesef elimizde" + kg +"kilogram" +fruit.getFruitName()+"yok");
      }else {
          System.out.println(kg+"kg"+fruit.getFruitName()+"alındı");
      }
  }

}
