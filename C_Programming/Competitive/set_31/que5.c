/*
   write a program which accept string from user and 
   display it in reverse order
   
   Input : "MarvellouS"    Output : "SoullevraM"
*/

#include<stdio.h>

void Reverse(char *str)
{
    char *start = NULL;

    start = str;

    while(*str != '\0')
    {
        str++;
    }
    str--;

    while(start <= str)
    {
        printf("%c",*str);
        str--;
    }
    printf("\n");
}

int main()
{
    char arr[20];

    printf("Enter string :");
    scanf("%[^'\n]s",arr);

    Reverse(arr);

    return 0;
}