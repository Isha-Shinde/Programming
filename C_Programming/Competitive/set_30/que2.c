/*
   accept character from user. if character is small display its corresponding capital character,
   and if it is small then display its corresponding capital.In other cases diplay as it is.

    Input : Q    Output : q
    Input : m    Output : M
    Input : 4    Output : 4
    Input : %    Output : %

*/

#include<stdio.h>

void Display(char ch)
{

        if(ch >= 'A' && ch <= 'Z')
        {
            ch = ch + 32;
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            ch = ch - 32;
        }
            printf("%c\n",ch);
        
}

int main()
{
    char cValue = '\0';

    printf("Enter the character :");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}