// write a program which accepts number from user and display below pattern.

#include<stdio.h>

int Pattern(int iNO)
{
    int iCnt = 0;
    
    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        printf("*\t");
    }
    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        printf("#\t");
    }
        
}

int main()
{
    int iValue = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    Pattern(iValue);

    return 0;
}