// Display reverse string

#include<stdio.h>

void ReverseDisplay(char *str)
{
    char *start = NULL;

    start = str;                   // Store starting address

    while(*str != '\0')
    {
        str++;                     // Move pointer to end of string
    }

    str--;                         // Move back to last character
    
    while(start <= str)
    {
        printf("%s\n",str);         // Print string from current pointer to end .Move pointer one character backward
        str--;
    }

    printf("\n");
}

int main()
{  
    char Arr[50] = {'\0'};

    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);
    
    ReverseDisplay(Arr);

    return 0;
}