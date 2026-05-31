//write a program which accept number from user and display its non factors.

#include<stdio.h>

int NonFact(int iNO)
{
    int iCnt = 0;
    
    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        if((iNO % iCnt) != 0)
        {
            printf("%d\t",iCnt);
        }
    }
}
int main()
{
    int iValue = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    NonFact(iValue);

    return 0;
}