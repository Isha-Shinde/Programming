#include<stdio.h>

int main()
{
    int i,j,k;

    printf("Enter First Number : \n");
    scanf("%d",&i);

    printf("Enter Second Number : \n");
    scanf("%d",&j);

    k = i + j;      //business logic

    printf("Addition is : %d\n",k);
    
    return 0;
}