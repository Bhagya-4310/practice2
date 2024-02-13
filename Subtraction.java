public class Subtraction{
    public int c;
    public int d;

    public Subtraction(int c, int d) {
        this.c = c;
        this.d = d;
    }
    public int sub(){
        Subtraction subtraction=new Subtraction(7,5);
        int total=c+d;
        System.out.println("sub="+total);
        return total;
    }
}