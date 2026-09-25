import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
class program845
{
    public static void main(String A[])
    {       
        LocalDate lobj = LocalDate.now();

        StudyLog sobj1 = new StudyLog(lobj,"C Programming",3.5,"Pointers in C");
        
        System.out.println(sobj1.Duration);// error

        System.out.println(sobj1.getDate());
        System.out.println(sobj1.getSubject());
        System.out.println(sobj1.getDuration());
        System.out.println(sobj1.getDiscription());
    }
}
class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private Double Duration;
    private String Discription;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Discription = d;
    }

    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Discription;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDiscription()
    {
        return this.Discription;
    }
}
