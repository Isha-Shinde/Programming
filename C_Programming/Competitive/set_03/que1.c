//write a program which accept one number from user and print that number of even numbers on screen

#include<stdio.h>

void PrintEven(int iNO)
{
    int iCnt = 1;

    if(iNO <= 0)
    {
        return;
    }

    while(iCnt <= iNO)
    {
        printf("%d ", 2 * iCnt);
        iCnt++;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number:\n");
    scanf("%d", &iValue);

    PrintEven(iValue);

    return 0;
}