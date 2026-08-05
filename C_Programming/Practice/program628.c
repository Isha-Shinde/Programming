#include<stdio.h>

int main()
{
    int iRet = 0;                               // Stores the return value of scanf()
    int i = 0, j = 0, k = 0; 

    printf("Enter 3 numbers : \n");
    iRet = scanf("%d %d %d",&i,&j,&k);         // Reads three integers and returns the number of successfully read inputs
    
    printf("Value of iRet is : %d\n",iRet);
    
    return 0;
}