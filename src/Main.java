public class Main
{
    public static void main(String[] args)
    {
        Cabinet[] building = new Cabinet[10];
        for(int i =0;i<building.length;i++)
        {
            building[i] = new Cabinet();
            System.out.println(building[i].toString());
        }
    }
}