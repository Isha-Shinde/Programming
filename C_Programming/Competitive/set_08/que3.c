//Write a program which accept distance in kilometer and convert it into meter.(1 kilometer = 1000 meter)

#include<stdio.h>
double KMtoMeter(int iNo)
{
    
    int iAns = 0;

    iAns = iNo * 1000;

    return iAns;    
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Distance :");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);

    printf("Distance in meter is : %d",iRet);
    
    return 0;
}