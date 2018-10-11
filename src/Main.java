public class Main
{
    public static void main(String[] args)
    {
        int CabinetsCount = 100;
        Cabinet[] building = new Cabinet[CabinetsCount];

        for(int i =0;i<building.length;i++)
        {
            building[i] = new Cabinet();
            System.out.println(building[i].toString());
        }
    }
}