public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int i = 0; i <= 10; i = i + 1){
            System.out.println(i);
        }
        System.out.println("Задача №2");
        for (int u = 10; u > 1; u = u - 1){
            System.out.println(u);
        }
        System.out.println("Задача №3");
        for (int o = 0; o < 17; o = o + 2){
            System.out.println(o);
        }
        System.out.println("Задача №4");
        for (int p = 10; p > -10; p = p - 1){
            System.out.println(p);
        }
        System.out.println("Задача №5");
        for (int e = 1904; e < 2096; e = e + 4){
            System.out.println(e + " год будет являться високостным.");
        }
        System.out.println("Задача №6");
        for (int w = 7; w < 98; w = w + 7){
            System.out.println(w);
        }
        System.out.println("Задача №7");
        for (int q = 1; q < 512; q = q * 2){
            System.out.println(q);
        }
        System.out.println("Задача №8");
        int month = 29000;
        int total = 0;
        for (int y = 0; y < 12; y++){
            total = total + month;
            System.out.println("Месяц " + y + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задача №9");
        int solar = 29000;
        int savings = 0;
        for (int a = 0; a < 12; a++){
            savings = savings + savings/100;
            savings = savings + solar;
            System.out.println("Месяц " + a + ", сумма накомплений равна " + savings + " рублей.");
        }
        System.out.println("Задача №10");
        for (int f = 1; f < 11; f = f + 1){
            System.out.println("2" + "*" + f + "=" + f * 2);
        }

    }
}