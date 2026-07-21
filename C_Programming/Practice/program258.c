#include<stdio.h>

void Update(char * str)
{
    char ch = '\0';

    while(*str != '\0')
    {
        if(*str == 'l')
        {
            *str = '-';
        }
        str++;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);         

    Update(Arr);
    printf("updated string is :%s\n",Arr);
    return 0;
}