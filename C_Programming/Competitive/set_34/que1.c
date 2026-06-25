/*
   write a program which accept string from user and copy the contents of that string into another string.
   (Implement strcpy() function) 
   
   Input : "Marvellous Multi OS"   e   Output : "Marvellous Multi OS"   in another string

*/

#include<stdio.h>

void strcpyX(char *src,char *dest)
{
    while(*src != '\0')
    {
        *dest = *src;
        src++;
        dest++;
    }
    *dest = '\0';
}


int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];   //Empty string

    strcpyX(arr,brr);

    printf("%s",brr);      //Marvellous Multi OS

    return 0;
}