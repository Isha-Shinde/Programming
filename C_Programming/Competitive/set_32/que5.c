/*
   write a program which accept string from user and count number of white spaces.

   Input : "MarvellouS"                                           Output : 0

   Input : "Marvellous Infosystems"                               Output :  1

   Input : "Marvellous Infosystems by piyush manohar khairnar"    Output :  5


*/

#include<stdio.h>

int CountWhite(char *str)
{
    int iCnt = 0;
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }
        str++;
    }
    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string :");
    scanf("%[^'\n]s",arr);

    iRet = CountWhite(arr);

    printf("%d",iRet);

    return 0;
}