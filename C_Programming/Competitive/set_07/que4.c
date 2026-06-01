//write a program to find odd facctorial of given number.

#include<stdio.h>

int OddFactorial(int iNO)
{
    int iCnt = 0;
    int iFact = 1;

    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        if((iCnt % 2) != 0)
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

    iRet = OddFactorial(iValue);

    printf("Odd Facctorial of number is %d",iRet);

    return 0;
}