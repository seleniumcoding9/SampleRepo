public class AddClass {
    public static void main(String[] args) //calling
    {
        AddClass ac = new AddClass();
        System.out.println(ac.addMethod(4,4));
    }
    public int addMethod(int c,int d) //called
    {
        int a = c+d;
        return a;

    }
}
