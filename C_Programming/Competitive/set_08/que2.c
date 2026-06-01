// write a program which accept width and heigt of rectangle form user and calculate its area. 
//(Area = width * height)

#include<stdio.h>
double RectArea(float fWidth,float fHeight)
{
    return fWidth * fHeight;
}

int main()
{
    float fvalue1 = 0.0 fvalue2 = 0.0;
    double dRet = 0.0;

    printf("Enter width");
    scanf("%f",&fvalue1);

    printf("Enter height");
    scanf("%f",&fvalue2);

    dRet = RectArea(fvalue1,fvalue2);

    printf("Area of rectangle is: %.2lf\n", dRet)

    return 0;
}