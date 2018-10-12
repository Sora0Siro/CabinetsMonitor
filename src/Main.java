import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        //LinkedList<Cabinet> cabin = new LinkedList<>();

        //variables
        int CabinetsCount = 100;
        int yearMax = 10;//max amount of lecturers in 1 year

        ArrayList<Cabinet> cabinets = new ArrayList<>();
        Random rnd = new Random();


        //Добавление кабинетов
        for (int i = 0; i < CabinetsCount; i++)
        {
            cabinets.add(new Cabinet());
            System.out.println(cabinets.get(i).toString());
        }
        System.out.println(cabinets.get(1).toString()); // убрать sout из мейна

        //Набор преподавателей на работу
        ArrayList<Lecturer> lecturers2018 = new ArrayList<>();
        for(int i =0;i<yearMax;i++)
            lecturers2018.add(new Lecturer());

        //Вывод имен из списка преподавателей
        System.out.println(lecturers2018.toString());

        //сокращение преподавателей
        System.out.println("================"+
                "\nСокращение преподавательского состава");
        lecturers2018.clear();
        //проверка преподавательского состава
        if(lecturers2018.isEmpty()) System.out.println("Преподавательский состав отсутствует.");
        else lecturers2018.toString();

        //прием новых преподаватей на работу
        System.out.println("================"+
                "\nНовый набор преподавателей");
        //1-ый способ
        Lecturer l1 = new Lecturer();
        System.out.println(l1.getName());//вариант вывода имени преподавателя
        lecturers2018.add(l1);
        //2-ой способ
        lecturers2018.add(new Lecturer());
        lecturers2018.get(lecturers2018.size()-1).getName(); //вариант вывода имени преподавателя(не применять если спосок пустой)
        lecturers2018.add(new Lecturer());
        lecturers2018.get(2).getName();//вариант вывода имени преподавателя(использовать при уверенности в существовании номера)
        try{
            lecturers2018.get(5).getName();
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("По заданному индексу данные отсутствуют.");//вывод для примера
            }
        //Вывод списка преподавателей
        System.out.println(lecturers2018.toString());
        //Изменение параметров преподавателей
        System.out.println(lecturers2018.get(0).getIfWantProjector());
        lecturers2018.get(0).setIfWantProjector(true);
        System.out.println(lecturers2018.get(0).getIfWantProjector());

        System.out.println(lecturers2018.get(1).getSpecialty());
        lecturers2018.get(1).setSpecialty("Technician");
        System.out.println(lecturers2018.get(1).getSpecialty());

        //Назначение преподавателю кабинета для пар
    }
}