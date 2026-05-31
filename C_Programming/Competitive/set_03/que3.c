//write a program which accept number from user and print even factors of that number.

#include<stdio.h>

void DisplayEvenFactor(int iNO)
{
    int i = 0;

    if(iNO <= 0)
    {
        iNO = -iNO;
    }
    for(i = 1; i<= iNO / 2; i++)
    {
         if((iNO % i == 0) && (i % 2 == 0)s)
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

    DisplayEvenFactor(iValue);

    return 0;
}