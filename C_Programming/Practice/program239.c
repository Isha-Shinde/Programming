#include<stdio.h>
#include<string.h>

int main()
{
    char *str = "Ganesh";      
    int iCount = 0;

    printf("length of string is : %lu\n",strlen(str));
    while(*str != '\0')
    {
       iCount++;
       str++;
    }

    printf("length of string is :%d\n",iCount);
    
    
    return 0;
}