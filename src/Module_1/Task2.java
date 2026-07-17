package Module_1;

public class Task2 {
    public static void showFString() {
        String city = "Sochi";
        int population = 1000000;
        double unemployed = 3.57;

        char section = 71;
        short seat = 32;
        int cost = 7500;

        String name = "Oleg";
        short age = 39;
        short height = 189;

        char charCode1 = 88;
        char charCode2 = 70;
        char charCode3 = 68;
        short numberCode = 143;
        short weight = 1897;

        String companyName = "Pupkin LTD.";
        int income = 1002040214;
        float marketShare = 34.76f;

        char rH = 43;
        short bloodType = 1;
        float percent = 61.3f;

        String universityName = "MIT";
        int numberOfStudents = 35000;
        double partOfExcluded = 0.27;

        char movieRating = 65;
        int numberOfCopies = 3500000;
        float IMDbRate = 88.3f;

        String brand = "BMW";
        int produced = 1005000;
        float salesPercentage = 45.5f;

        char category = 81;
        long code = 1046038214111L;
        float byersOlder30 = 23.32f;

        String line1 = String.format("Город - %s, население - %,d, безработных %.2f", city, population,unemployed);
        String line2 = String.format("Секция - %c, место - %d, стоимость билета %d", section, seat,cost);
        String line3 = String.format("Имя - %s, возраст - %d, рост %d", name, age,height);
        String line4 = String.format("Буквенный код машины - %c%c%c, числовой код машины - %d [ИТОГ: %c%d%c%c], вес автомобиле %d", charCode1,charCode2,charCode3, numberCode,charCode1,numberCode,charCode2,charCode3,weight);
        String line5 = String.format("Название компании - %s, годовой доход - %,d, доля на рынке %.2f", companyName, income,marketShare);
        String line6 = String.format("Резус-фактор %c, шруппа крови - %d, доля людей %.3f", rH, bloodType,percent);
        String line7 = String.format("Наименование университета - %s, количество студентов - %,d, доля отчсленных %.2f", universityName, numberOfStudents,partOfExcluded);
        String line8 = String.format("Рейтинг фильма - %c, число копий - %,d, рейтинг %.2f", movieRating, numberOfCopies,IMDbRate);
        String line9 = String.format("Название бренда - %s, произведено штук - %,d, процент продаж %.2f", brand, produced, salesPercentage);
        String line10 = String.format("Категория товара - %c, штрих-код - %d, покупетелей старше 30 лет - %.2f", category, code,byersOlder30);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
        System.out.println(line8);
        System.out.println(line9);
        System.out.println(line10);
    }
}
