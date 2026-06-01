/*
write a program which accept number from user and if number is less than 50 then print small, 
if it is greater than 50 and less than 100 then print medium, if it is greater than 100 then print large
*/

#include<stdio.h>

void Number(int iNo)
{
    int iCnt = 0;

    if(iNo < 50)
    {
        printf("Number is small");
    }
    else if((iNo >= 50) && (iNo < 100))
    {
        printf("Number is medium");
    }
    else
    {
        printf("Number is large");
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number :\n");
    scanf("%d",&iValue);

    Number(iValue);

    return 0;
}