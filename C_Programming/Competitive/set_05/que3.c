//Write a program which accept number from user and print its number line.

#include<stdio.h>

int Display(int iNO)
{
    int iCnt = 0;

    for(iCnt = -iNO ; iCnt <= iNO; iCnt++)
    {
        printf("%d\t",iCnt);
    } 
}
int main()
{
    int iValue = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    Display(iValue);


    return 0;
}