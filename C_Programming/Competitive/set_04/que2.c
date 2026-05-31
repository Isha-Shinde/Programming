//write a program which accept number from user and display its factors in decreasing order.

#include<stdio.h>

int FactRev(int iNO)
{
    int iCnt = 0;
    
    for(iCnt = (iNO / 2); iCnt >= 1; iCnt--)
    {
        if((iNO % iCnt)==0)
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

    FactRev(iValue);

    return 0;
}