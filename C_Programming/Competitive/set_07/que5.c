//wrie a program which returns difference between Even Factorial and Odd Factorial of given number.

#include<stdio.h>

int FactorialDiff(int iNO)
{
    int iCnt = 0;
    int iEvenFact = 1;
    int iOddFact = 1;

    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        if((iCnt % 2) == 0)
        {
            iEvenFact = iEvenFact * iCnt;
        }
        else
        {
            iOddFact = iOddFact * iCnt;
        }
    }
    return iEvenFact - iOddFact;
}

int main()
{
    int iValue = 0,iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("Facctorial Difference is %d",iRet);

    return 0;
}