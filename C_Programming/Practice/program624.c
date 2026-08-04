#include<stdio.h>

int main()
{
    char str[80] = {'\0'};          // Character array to store the command (maximum 79 characters + '\0')

    printf("Enter command : \n");   
    //scanf("%[^'\n']s",str);
    fgets(str, sizeof(str), stdin);   // Reads the complete line including spaces

    printf("Entered command is : %s\n",str);  // Displays the entered command

    return 0;
}