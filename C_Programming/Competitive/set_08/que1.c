/*
    Write a program which accept radius of circle from user and calculate it area.
    Consider value of PI is 3.14(Area = PI * Radius * Radius)
*/

#include<stdio.h>

double CircleArea(float fRadius)
{
    double dArea = 0.0;

    dArea = 3.14 * fRadius * fRadius;

    return dArea;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter Radius");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("calculated area is : %f\n", dRet);

    return 0;
    
}