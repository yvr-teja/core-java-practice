package basic.java.course;

public class ContinueStatement {
    public static void main(String[] args) {
        //continue statement
        for (int i=0;i<10;i++)
        {

            if (i==2)
                continue;
            System.out.println(i);
        }
    }
}
