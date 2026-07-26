/*
    Write a recursive program which accpet number form user and return its product of digits.

    Input : 523         Output  :  30

*/

#include<stdio.h>

int Mult(int iNo)
{
    static int iDigit = 0;
    static int product = 1;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        product = product * iDigit;

        iNo = iNo / 10;

        Mult(iNo);
    }
    return product;
}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    iRet = Mult(iValue);
    printf("product of digit is : %d\n",iRet);

    return 0;
}