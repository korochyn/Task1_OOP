/*
 Домашнее задание на закрепление:
 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 3)Создать класс Basket, содержащий массив купленных товаров.
 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
 5)Вывести на консоль каталог продуктов. (все продукты магазина)
 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
*/


package org.example.OOP_Task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Kategori  kategori1  = new Kategori("категория товаров - Спорт");
        kategori1.addTovar(new Tovar("Велосипед", 450.0, 4));
        kategori1.addTovar(new Tovar("Тренажер", 650.0, 4));
        kategori1.addTovar(new Tovar("Костюм", 350.0, 4));

        Kategori  kategori2  = new Kategori("категория товаров - Инструмент");
        kategori2.addTovar(new Tovar("Лом", 450.0, 4));
        kategori2.addTovar(new Tovar("Топор", 650.0, 4));
        kategori2.addTovar(new Tovar("Молоток", 350.0, 4));

        Kategori  kategori3  = new Kategori("категория товаров - Одежда");
        kategori3.addTovar(new Tovar("Штаны", 450.0, 4));
        kategori3.addTovar(new Tovar("Рубашка", 650.0, 4));
        kategori3.addTovar(new Tovar("Кепка", 350.0, 4));

        shop.addKategoris(kategori1);
        shop.addKategoris(kategori2);
        shop.addKategoris(kategori3);
        System.out.println("_______________________________");
        System.out.println("Каталог магазина до покупок");
        shop.printKatalog();
        System.out.println("_______________________________");

        User user1 = new User("user1", "pass1");
        User user2 = new User("user2", "pass2");
        User user3 = new User("user3", "pass3");

        user1.getBasket().addTovar(kategori1.getTovars().get(0));
        user2.getBasket().addTovar(kategori2.getTovars().get(1));
        user3.getBasket().addTovar(kategori3.getTovars().get(2));

        kategori1.getTovars().remove(0);
        kategori2.getTovars().remove(1);
        kategori3.getTovars().remove(2);

        System.out.println(user1.getLogin() + " - купил:");
        ArrayList<Tovar> user1Tovars = user1.getBasket().getTovars();
        for (Tovar tovar : user1Tovars) {
            System.out.println("- " + tovar.getName() + " - " + tovar.getCena() + " - " +tovar.getReiting());
        }
        System.out.println(user2.getLogin() + " - купил:");
        ArrayList<Tovar> user2Tovars = user2.getBasket().getTovars();
        for (Tovar tovar : user2Tovars) {
            System.out.println("- " + tovar.getName() + " - " + tovar.getCena() + " - " +tovar.getReiting());
        }

        System.out.println(user3.getLogin() + " - купил:");
        ArrayList<Tovar> user3Tovars = user3.getBasket().getTovars();
        for (Tovar tovar : user3Tovars) {
            System.out.println("- " + tovar.getName() + " - " + tovar.getCena() + " - " +tovar.getReiting());
        }

        System.out.println("_______________________________");
        System.out.println("Каталог магазина после покупок");
        
        shop.printKatalog();
        System.out.println("_______________________________");

    }
    
}
