/*
   write a program which accept string from user and 
   return difference between frequency of small characters and frequency of capital characters
   
   Input : "Marvellous"    Output : 6 (8 - 2)
*/

#include<stdio.h>

int Difference(char *str)
{
    int iCnt = 0;
    int CapitalCount = 0;
    int SmallCount = 0;

    while(*str != '\0')
    {
        if(*str >= 'A' && *str <= 'Z')
        {
            CapitalCount++;
        }
        else
        {
             SmallCount++;
        }
        str++;
    }
    return SmallCount - CapitalCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string :");
    scanf("%[^'\n]s",arr);

    iRet = Difference(arr);

    printf("%d",iRet);

    return 0;
}