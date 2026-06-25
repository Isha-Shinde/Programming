/*
   write a program which accept 2 strings from user and concat second string after first string.

   Input : "Marvellous Infosystems"
            "Logic Building"
        
    Output : "Marvellous Infosystems Logic Building" 
   
*/

#include<stdio.h>

void StrCatX(char *src,char *dest)
{
    //Fileter
    while(*src != '\0')   //Traverse first string still end
    {
       src++;
    }
    while(*dest != '\0')   //copy contents of destination in source
    {
        *src = *dest;
        src++;
        dest++;
    }
    *src = '\0';
}


int main()
{
    char arr[30] = "Marvellous Infosystems ";
    char brr[30] = "Logic Building";

    StrCatX(arr,brr);

    printf("%s ",arr);      //Marvellous Infosystems Logic Building

    return 0;
}