import java.util.*;

class program838
{
    public static void main(String A[])
    {
        StudyLog sobj1 = new StudyLog("C",2.5);
        StudyLog sobj2 = new StudyLog("Java",4.5);

        System.out.println(sobj1);
        System.out.println(sobj2);
    }
}
class StudyLog
{
    public String Subject;
    public Double Duration;

    public StudyLog(String a, double d)
    {
        this.Subject = a;
        this.Duration = d;
    }

}
