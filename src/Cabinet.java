interface Characteristics
{
    void cabinetFloor(int floor);
    void studentsCapacity(int studentsCapacity);
    void computersCount(int computersCount);
    void laptopCapacity(int laptopCapacity);
    void airConditioning(boolean airConditioning);
    void projector(boolean value);
}

public class Cabinet implements Characteristics
{
    private int v_cabinetFloor; //этаж на котором находится аудитория
    private int v_studentsCapacity; // кол-во мест для студентов
    private int v_computersCount; // кол-во настольных компьютеров в аудитории
    private int v_laptopCapacity; //кол-во ноутбуков которые могут работать от розетки за рабочим местом
    private int v_roomNumber; // номер аудитории
    private boolean v_airConditioning; //наявность кондиционера в аудитории
    private boolean v_projector; //наявность проектора в аудитории

    Cabinet()
    {
        //variable
        v_cabinetFloor = 1;
        v_studentsCapacity = 1;
        v_computersCount = 1;
        v_laptopCapacity = 1;
        v_airConditioning = false;
        v_projector = false;
    }

    public void cabinetFloor(int floor)
    {
        v_cabinetFloor = floor;
    }

    public void studentsCapacity(int studentsCapacity)
    {
        v_studentsCapacity = studentsCapacity;
    }

    public void computersCount(int computersCount)
    {
        v_computersCount = computersCount;
    }

    public void laptopCapacity(int laptopCapacity)
    {
        v_laptopCapacity = laptopCapacity;
    }

    public void airConditioning(boolean airConditioning)
    {
        v_airConditioning = airConditioning;
    }

    public void projector(boolean value)
    {
        v_projector = value;
    }
}
