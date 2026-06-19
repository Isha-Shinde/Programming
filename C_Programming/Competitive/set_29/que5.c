/*accept division of student fro user and depends on the division Display exam timing.
There are 4 divisions in scchool as A,B,C,D.Exam of division A at 7 AM,
B at 8.30 AM,C at 9.20 AM and D at 10.30 AM.
(Application should be case sensitive).

Input : C    Output : your exam at 9.20AM

Input : d    Output : your exam at 10.30AM

*/

#include<stdio.h>

void DisplaySchedule(char chDiv)
{
    if(chDiv == 'A')
    {
        printf("your exam at 7AM");
    }
    else if(chDiv == 'B')
    {
        printf("your exam at 8.30 AM");
    }
    else if(chDiv == 'C')
    {
        printf("your exam at 9.20 AM");
    }
    else if(chDiv == 'D')
    {
        printf("your exam at 10.30 AM");
    }
    else
    {
        printf("there is no exam");
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the division :");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0;
}