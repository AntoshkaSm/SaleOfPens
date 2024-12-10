/*
Данный класс предназначен для расчёта
цены товара (ручек) вместе со скидкой в зависимости
от итоговой суммы покупки, а также для расчёта скидки
на цену в зависимости от стоимости покупки
*/
public class SaleOfPens {
    public static void main(String[] args) {
        Price pens = new Price();
        pens.quantity = 100; // количество товара (штук)
        pens.price = 35.50; // цена товара (в рублях)
        pens.discount = 10; // скидка товара (в процентах)
        pens.payment();

        /*
        Данный класс предназначен для расчёта
        цены товара вместе с скидкой в зависимости
        от итоговой суммы покупки
         */
        class myDiscount {
            double discount1 = 0.75; // скидка 1 на товар
            double discount2 = 42.575; // скидка 2 на товар
            double discount3 = 59.1; // скидка 3 на товар
            int myQuantity; // количество товара
            double myPrice; // цена товара



            String many() {
                double total = myQuantity * myPrice; // Расчёт цены покупки без скидки
                if (total < 0) { // здесь проверка, что все введённые данные положительные
                    System.out.println("Ошибка ввода");
                } else {
                    if (total < 2000 && total > 0) { // условие, что цена больше 0, но меньше 2000 рублей
                        total = myQuantity * myPrice * (1 - (discount1 / 100));
                    }
                    else if (total < 5000 && total > 0) { // условие, что цена больше 0, но меньше 5000 рублей
                        total = myQuantity * myPrice * (1 - (discount2 / 100));
                    }
                    else {
                        total = myQuantity * myPrice * (1 - (discount3 / 100));
                    }
                    return (String.format("%.2f", total)); // Здесь форматирую вывод до 2 знака после запятой
                }
                return ("Error");
            }
        }

        myDiscount notebooks = new myDiscount(); // создание объекта для покупки - тетради
        notebooks.myQuantity = 8; // количество товара
        notebooks.myPrice = 50; // цена товара
        System.out.println("Стоимость тетрадей = " + notebooks.many() + " р.");


        myDiscount books = new myDiscount();  // создание объекта для покупки - книги
        books.myQuantity = 7; // количество товара
        books.myPrice = 200; // цена товара
        System.out.println("Стоимость книжек = " + books.many() + " р.");

        myDiscount briefcase = new myDiscount(); // создание объекта для покупки - портфели
        briefcase.myQuantity = 1; // количество товара
        briefcase.myPrice = 5000; // цена товара
        System.out.println("Стоимость портфеля = " + briefcase.many() + " р.");
    }
}
/*
Данный класс содкржит 3 параметра:
- количество товара,
- цену товара,
- скидку на товар.
Затем данный класс выводит два собщени
о сумме к оплате без скидки и с скидкой.
 */
class Price {
    int quantity; // количество товара
    double price; // цена товара
    double discount; // скидка товара
    void payment(){
        System.out.println("Итого к оплате = " + (quantity * price) + " р.");
        System.out.println("Итого к оплате с скидкой = " + (quantity * price * (1 - discount / 100)) + " р.");
    }
}