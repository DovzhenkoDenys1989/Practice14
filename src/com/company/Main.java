package com.company;

public class Main {

    public static void main(String[] args) {

       Client client = new Client("Зарецкая Анастасия Олеговна", "14.01.1996","+380675555555","25%",2000);
       Manager manager = new Manager("Петров Петр Петрович","21.03.1985","+380635555555","01.02.2015",25000,"с 8.00 - 18.00","Офис");
       Cashier cashier = new Cashier("Семенов Семен Семенович","25.05.1995", "+380935555555","01.04.2017",15000, "с 8.00 - 20.00", (byte) 2);
       Security security = new Security("Александров Александр Александрович", "02.08.1992","+380735555555","01.05,2018",16000,"с 8.00 - 20.00");
       Shop shop = new Shop("SportMaster", "проспект Соборный, 45", manager,cashier,security,client);

       //1
       shop.open();

       //2
       shop.sellProduct();

       //3
       shop.onlunch();
    }
}
//        1. Наследование. Реализовать иерархию классов с полями и методами
//        2. Реализовать работу методов, эмулируя действия выводом текста в консоль. Например,
//        при выполнении метода «консультировать» выводить на экран текст: «Консультант
//        рассказывает о товаре».
//        3. Переопределить метод «делатьРаботу» для Менеджера, Кассира и Охранника. Внутри
//        каждого из них вывести сообщение, описывающее работу конкретного сотрудника, а
//        также вызвать другие вспомогательные методы.
//        4. Создать класс «Магазин» с композицией из ранее созданных классов.
//        5. Проверить работу магазина. Создать экземпляр класса магазин и выполнить цепочку
//        методов для демонстрации процесса работы магазина:
//        1) Магазин открывается -> все сотрудники приходят на работу
//        2) Магазин начинает продавать товары: клиент узнает про товары -> менеджер
//        делает «свою» работу -> клиент покупает товар -> кассир делает «свою» работу
//        -> охранник делает «свою» работу.
//        3) Магазин закрывается на обед -> сотрудники идут на обед.
//        6. Для всех классов сгенерировать методы: equals, hashcode и toString
//        7. Создать конструктор для класса «Человек», в который передать поля «фио» и «номер
//        телефона». Решить проблемы с конструкторами в дочерних классах
