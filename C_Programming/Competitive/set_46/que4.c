/*
    Write a recursive program which accpet number form user and return smallest digit.

    Input : 87983       Output  :  3

*/

#include<stdio.h>

int Min(int iNo)
{
    int iDigit = 0;
    static int iMin = 9;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit < iMin)
        {
            iMin = iDigit;
        }
        iNo = iNo / 10;

        Min(iNo);
    }
    return iMin;
}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    iRet = Min(iValue);

    printf("Smallest digit is : %d\n",iRet);

    return 0;
}