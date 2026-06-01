// Write a program to find even factorial of given number.


#include<stdio.h>

int EvenFactorial(int iNO)
{
    int iCnt = 0;
    int iFact = 1;
    
    for(iCnt = 2; iCnt <= iNO ; iCnt++)
    {
        if((iCnt % 2 )== 0)
        {
            iFact = iFact * iCnt;
        }
    }
      return iFact;
}

int main()
{
    int iValue = 0,iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);

    printf("Even Factorial of number is %d",iRet);

    return 0;
}