/*ALGORITHM

    START
        Accept first number as NO1
        Accept Second number as NO2
        Performed addition of NO1 and NO2
        Display the result
    STOP
*/
#include<stdio.h>

int main()
{
    float i,j,k;

    printf("Enter First Number :\n");
    scanf("%f",&i);

    printf("Enter Second Number :\n");
    scanf("%f",&j);

    k = i + j;

    printf("Addition is : %f\n",k);

    return 0;
}