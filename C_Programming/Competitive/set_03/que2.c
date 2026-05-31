//write a program which accept one number from user and print  even factor of that number.

#include<stdio.h>

void DisplayFactor(int iNO)
{
    int i = 0;

    if(iNO <= 0)
    {
        iNO = -iNO;
    }
    for(i = 1; i<= iNO; i++)
    {
         if(iNO % i == 0)
    {
        printf("%d",i);
    }

    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number:\n");
    scanf("%d", &iValue);

    DisplayFactor(iValue);

    return 0;
}