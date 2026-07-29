/*
    write a program which accept file name and one character from user and count number of occurences of that characters from that file.

    Input  : Demo.txt   M 

*/

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 100
int CountChar(char FName[],char ch)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0, iRet = 0;
    int i = 0, iCount = 0;

    fd = open(FName,O_RDONLY);
    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] == ch)
            {
                iCount++;
            }
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);
    return iCount;
}
int main()
{
    char FileName[30];
    int iRet = 0;
    char cValue;
    
    printf("Enter file name : \n");
    scanf(" %[^'\n']s",FileName);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    iRet = CountChar(FileName,cValue);
    printf("Frequency is : %d\n",iRet);
    return 0;
}