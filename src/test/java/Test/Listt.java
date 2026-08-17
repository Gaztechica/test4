//package Test;
//
//import AutoTest.runner.BaseTest;
//import org.junit.Test;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import java.security.Key;
//import java.util.*;
//import java.util.stream.Collectors;
//
//import static org.testng.Assert.assertEquals;
//
//public class Listt {
//
//    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>();
//
//        list.add("Sergey");
//        list.add("Anna");
//        list.add("Lusy");
//
//        System.out.println(list);
//
//        for (String lis : list) {
//            System.out.println(lis);
//        }
//
//        list.remove(2);
//
//        System.out.println(list);
//
//
//        ArrayList<Integer> iList = new ArrayList<>();
//
//        iList.add(1);
//        iList.add(1);
//        iList.add(2);
//        iList.add(3);
//
//        System.out.println(iList);
//
//
//        HashSet<String> from = new HashSet<>();
//
//
//        public class C {
//            public static String describeAge(int age) {
//                if (age <= 12) {
//                    return "You're a(n) kid";
//                } else if (age >= 13 && age <= 17) {
//                    return "You're a(n) teenager";
//                } else if (age >= 18 && age <= 64) {
//                    return "You're a(n) adult";
//                } else {
//                    return "You're a(n) elderly";
//                }
//            }
//        }
//
//
//        public class Kata {
//
//            public static String well(String[] x) {
//                // TODO
//                String good = "good";
//                String[]
//                if (good > 2) {
//                    return "I smell a series";
//                } else if (good >= 1 && good >= 2) {
//                    return "Publish";
//                } else {
//                    return "Fail";
//                }
//            }
//        }
//
//
//        public class SolutionTest {
//            @Test
//            public void basicTests() {
//                assertEquals("Fail!", Kata.well(new String[]{"bad", "bad", "bad"}));
//                assertEquals("Publish!", Kata.well(new String[]{"good", "bad", "bad", "bad", "bad"}));
//                assertEquals("I smell a series!", Kata.well(new String[]{
//                        "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
//
//            }
//        }
//
//
//        public static String reverseWords (String str){
//            //write your code here...
//            assertEquals("world! hello", ReverseWords.reverseWords("hello world!"));
//        }
//
//
//        from.add("11");
//        from.add("11");
//        from.add("22");
//        from.add("33");
//        System.out.println(from);
//
//                HashMap<String, Integer> map = new HashMap<>();
//        map.put("Sergey",25);
//        map.put("Igory",29);
//        map.put("Koly",25);
//        map.put("Sergey4",65);
//        System.out.println(map);
//        System.out.println(map.get("Igory"));
//
//        for(
//                String age :map.keySet())
//
//                {
//                    System.out.println(map.get(age));
//                }
//
//
//                //        анонимные функции
////                лямбды
////                        (параметр)-> выражение
//                List<Integer> numb = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//                List<Integer> evenNumb = numb.stream()
//                        .filter(n -> n % 2 == 0)
//                        .collect(Collectors.toList());
//        System.out.println(evenNumb);
//            }
//        }
