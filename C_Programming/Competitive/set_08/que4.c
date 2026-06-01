//write a program which accept temprature in fahrenheit and convert it into celsius.
//(1 celsius = (Fahrenheit -32)* (5/9)

#include<stdio.h>

double FhtoCs(float fTemp)
{
    double iAns = 0.0;

    iAns = (fTemp - 32) * (5.0/9.0);

    return iAns; 
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter temprature in Fahrenheit :");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf("temprature in celsius is : %lf",dRet);

    return 0;
}