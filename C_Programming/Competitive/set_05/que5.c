//Write a program which accept N from user and print first multiples of N.

#include<stdio.h>

int MultipleDisplay(int iNO)
{
    int iCnt = 0;
    int Ans = 0;

    for(iCnt = 1 ; iCnt <= 5; iCnt++)
    {
            Ans = iCnt * iNO;
            printf("%d\t",Ans);
    } 
}
int main()
{
    int iValue = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);


    return 0;
}