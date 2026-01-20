package Test;

public class Test_Test {

    public static void main(String[] args) {


///**
// * управляющие конструкции
// * else if проверяет на true folse
// */
//        int tt = 3;
//
//        if (tt == 1) {
//            System.out.println(2);
//        } else if (tt == 3) {
//            System.out.println(22);
//        } else {
//            System.out.println(3333);
//        }
//
///**
// * if
// */
//
//        if ((tt % 3) == 0) {
//            System.out.println("==0");
//        } else {
//            System.out.println("!==");
//        }
//
//
//        /**
//         * switch case работает со значениями переменной
//         * */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("какого вам размера пиццу?");
//        if (scanner.hasNextInt()) {
//            System.out.println("вы ввели число, а надо строку");
//
//        } else if (scanner.hasNextLine()){
//            System.out.println("строка");
//        }
//        String pizzaSise = scanner.nextLine();
//        int price = 0;
//        switch (pizzaSise) {
//            case "среднюю":
//                price = 750;
//                break;
//            case "маленькую":
//                price = 500;
//                break;
//            case "большую":
//                price = 1000;
//                break;
//            default:
//                System.out.println("нет такого размера пиццы");
//        }
//        System.out.println("За " + pizzaSise + " с вас " + price + " рублей");


//        /**
//         * циклы
//         */
//
//        int count = 10;
//        while (count > 0) {
//            count--;
//            if (count == 4) {
//                break;
//            }
//            System.out.println(count);
//        }

//        int row = 1;
//        while (row < 4) {
//            int cal = 1;
//            while (cal <= 5) {
//                System.out.print("#");
//                cal++;
//            }
//            System.out.println();
//            row++;
//        }

//        int rows = 1;
//        do {
//            System.out.println("gg " + rows);
//            rows++;
//        }
////        while (false);
//        while (rows < 4);


//        int rows2 = 1;
//        do {
//            System.out.println("gg " + rows2);
//            rows2++;
//            if (rows2 == 5) {
//                break;
//            }
//        } while (true);
////        while (rows < 4);
//
//
//        for (int i = 0; i < 15; i++) {
//            if (i % 3 == 0)
//                continue;
//            System.out.println("ee " + i);
//        }

        /*
         * for each
         * */
//        int ar = 5;
//        int[] nameAr = new int[ar];
//
//        int count = 1;
//        for (int i : nameAr) {
//            i = count;
//            count++;
//            System.out.println(i);
//        }

        int ro = 5;
        int ca = 5;
        int[][] call = new int[ro][ca];
        int[][] call3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(call3x3[1][1]);

        for (int ro1 = 0; ro1 < call3x3.length; ro1++) {
            for (int ca1 = 0; ca1 < call3x3[ro1].length; ca1++) {
                System.out.print(call3x3[ro1][ca1] + " ");
            }
            System.out.println();
        }

//    List<String> sList = new ArrayList<>();
//
//        sList.add("Sergey");
//        sList.add("Anna");
//        sList.add("Lusy");
//
//        System.out.println(sList);
//
//        sList.remove(2);
//
//        System.out.println(sList);
//
//    List<Integer> iList = new ArrayList<>();
//
//        iList.add(1);
//        iList.add(2);
//        iList.add(3);
//
//        System.out.println(iList);

    }
}
