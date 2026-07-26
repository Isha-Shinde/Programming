/*
    Write a recursive program which accpet number form user and return its reverse number.

    Input : 523         Output  :  325

*/

#include<stdio.h>

int Reverse(int iNo)
{
    static int iRev = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        iRev = (iRev * 10) + iDigit;

        iNo = iNo / 10;

        Reverse(iNo);
    }
    return iRev;
}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    iRet = Reverse(iValue);
    printf("product of digit is : %d\n",iRet);

    return 0;
}