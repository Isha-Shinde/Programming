#include<stdio.h>

int main()
{
    char str[50];
    int iRet = 0;      // Variable to store the return value of sprintf()

    iRet = sprintf(str,"jay ganesh...");

    printf("value from iRet is : %d\n",iRet);

    return 0;
}