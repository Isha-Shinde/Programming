/*
    write a program which accept file name and one count from user and read that number of characters from starting position.

    Input  : Demo.txt   12 

*/

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 100
void DisplayN(char FName[],int iSize)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0, iRet = 0;

    fd = open(FName,O_RDONLY);
    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    iRet = read(fd,Buffer,iSize);
    
    write(1,Buffer,iRet);
    close(fd);
}
int main()
{
    char FileName[30];
    int iValue = 0;
    
    printf("Enter file name : \n");
    scanf(" %[^'\n']s",FileName);

    printf("Enter the number character : \n");
    scanf(" %d",&iValue);

    DisplayN(FileName,iValue);
    return 0;
}