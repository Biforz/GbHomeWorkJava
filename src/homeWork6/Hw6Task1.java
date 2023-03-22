package homeWork6;

import java.io.IOException;
import java.util.*;

public class Hw6Task1 {
    public static void main(String[] args) {
        List<NoteBook> list = new ArrayList<>();
        NoteBook note1 = new NoteBook("Lenovo", "13.6", "i3", "Linux", 8, 256);
        NoteBook note2 = new NoteBook("Asus", "14.3", "i9", "Windows", 16, 1024);
        NoteBook note3 = new NoteBook("HP", "15.6", "i7", "Windows", 8, 256);
        NoteBook note4 = new NoteBook("Macbook", "16.2", "M1", "MacOS", 16, 512);
        NoteBook note5 = new NoteBook("Dexp", "15.1", "i3", "Windows", 8, 512);
        NoteBook note6 = new NoteBook("Acer", "13.6", "i5", "Linux", 8, 512);
        NoteBook note7 = new NoteBook("Macbook", "13.6", "M1", "MacOS", 8, 512);
        NoteBook note8 = new NoteBook("Macbook", "14.3", "M2", "MacOS", 16, 1024);
        Collections.addAll(list, note1, note2, note3, note4, note5, note6, note7, note8);

        System.out.print("Варианты поиска:\n1 - Модель\n" +
                "2 - Диагональ экрана\n3 - Процессор\n4 - Операционная система\n5 - Оперативная память\n" +
                "6 - Объем накопителя\n7 - Выход\nВведите критерии поиска (можно несколько через пробел): ");

        Scanner sc = new Scanner(System.in);
        String[] choice = sc.nextLine().split(" ");

        for (String el : choice) {
            try {
                switch (el) {
                    case "1":
                        System.out.print("Введите модель ноутбука (Lenovo, Asus, HP, Macbook): ");
                        String str = sc.next();
                        modelSort(list, str);
                        System.out.println(list);
                        break;
                    case "2":
                        System.out.print("Введите минимальную диагональ экрана: ");
                        String n = sc.next();
                        sizeSort(list, n);
                        for (NoteBook st : list) {
                            System.out.println(st);
                        }
                        break;
                    case "3":
                        System.out.print("Введите выберите процессор (i3, i7, i9, M1): ");
                        String cpuStr = sc.next();
                        cpuSort(list, cpuStr);
                        for (NoteBook st : list) {
                            System.out.println(st);
                        }
                        break;
                    case "4":
                        System.out.print("Выберите процессор (Linux, Windows, MacOs): ");
                        String osStr = sc.next();
                        osSort(list, osStr);
                        for (NoteBook st : list) {
                            System.out.println(st);
                        }
                        break;
                    case "5":
                        System.out.print("Выберите минимальный объём оперативной памяти (8, 16): ");
                        int ramNum = sc.nextInt();
                        ramSort(list, ramNum);
                        for (NoteBook st : list) {
                            System.out.println(st);
                        }
                        break;
                    case "6":
                        System.out.print("Выберите минимальный объём накопителя (256, 512, 1024): ");
                        int ssdNum = sc.nextInt();
                        ssdSort(list, ssdNum);
                        for (NoteBook st : list) {
                            System.out.println(st);
                        }
                        break;
                    case "7":
                        System.out.println("Всего хорошего");
                        break;
                    default:
                        throw new IOException();
                }
            }
            catch (IOException e) {
                System.out.println("Неверный ввод");
            }
        }
    }

    public static void modelSort(List<NoteBook> list, String str) {
        list.removeIf(item -> !str.equals(item.getModel()));
    }
    public static void sizeSort(List<NoteBook> list, String n) {
        list.removeIf(item -> !n.equals(item.getSize()));
    }
    public static void cpuSort(List<NoteBook> list, String cpuStr) {
        list.removeIf(item -> !cpuStr.equals(item.getCpu()));
    }
    public static void osSort(List<NoteBook> list, String osSrt) {
        list.removeIf(item -> !osSrt.equals(item.getOs()));
    }
    public static void ramSort(List<NoteBook> list, int ramNum) {
        list.removeIf(item -> !(item.getRam() == ramNum));
    }
    public static void ssdSort(List<NoteBook> list, int ssdNum) {
        list.removeIf(item -> !(item.getSsd() == ssdNum));
    }
}
