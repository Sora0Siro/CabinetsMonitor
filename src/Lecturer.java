import java.awt.*;
import java.util.Random;

public class Lecturer
{
    private Random rnd = new Random();
    private String[] bunchOfNames =
            {
                    "Авдей",
                    "Аверкий",
                    "Авксентий",
                    "Агафон",
                    "Александр",
                    "Алексей",
                    "Альберт",
                    "Альвиан",
                    "Вадим",
                    "Валентин",
                    "Валерий",
                    "Валерьян",
                    "Варлам",
                    "Варфоломей",
                    "Василий",
                    "Венедикт",
                    "Вениамин" ,
                    "Викентий",
                    "Виктор" ,
                    "Виссарион",
                    "Виталий",
                    "Владимир",
                    "Владислав",
                    "Владлен",
                    "Влас"};
    private String v_name;
    private String v_specialty;
    private boolean v_wantProjector;
    private int v_numberOfLectures;
    //constructors
    public Lecturer()
    {
        v_name = bunchOfNames[rnd.nextInt(bunchOfNames.length-1)];//псевдо случайное имя из набора имен
        v_specialty = "none";
        v_wantProjector = rnd.nextBoolean();
        v_numberOfLectures = rnd.nextInt(10);
    }

    public Lecturer(String name, String specialty, boolean wantProjector, int numberOfLectures)
    {
        v_name = name;
        v_specialty = specialty;
        v_wantProjector = wantProjector;
        v_numberOfLectures = numberOfLectures;
    }

    //set methods
    public void setName(String name)
    {
        v_name = name;
    }

    public void setSpecialty(String specialty)
    {
        v_specialty=specialty;
    }

    public void setIfWantProjector(Boolean wantProjector)
    {
        v_wantProjector = wantProjector;
    }

    public void minusHour()
    {
        if(v_numberOfLectures>0)v_numberOfLectures--;
        //else добавить переработку..сверхурочные
    }

    public void setNumberOfLectures(int number)
    {
        v_numberOfLectures = number;
    }


    //return/get methods
    public String getName()
    {
        return "Имя выбранного преподавателя: " + v_name;
    }

    public String getSpecialty()
    {
        return "Специальность: " + v_specialty;
    }

    public String getIfWantProjector()
    {
        if(v_wantProjector) return "Преподавателю " + v_name + " нужен проектор";
        else return "Преподавателю " + v_name + " не нужен проектор";
    }

    public int getNumberOfLectures()
    {
        return v_numberOfLectures;
    }

    public boolean getIfWantProjectorB()
    {
        return v_wantProjector;
    }

    @Override
    public String toString()
    {
        if(v_name == null || v_name.equals("") || v_name.equals("") || v_name.isEmpty()) return "Преподавательский состав отсутсвует.";//много параметров из-за нюансов)
        else return v_name;
    }
}