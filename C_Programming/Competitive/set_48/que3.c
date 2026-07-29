/*
    write application which accept file name from user and read all data from thatfile and display contents on screen.
    Input : Demo.txt  
*/

#include<stdio.h>
#include<string.h>
#include<fcntl.h>

#define BUFFER_SIZE 100
void ReadFile(char FName[])
{ 
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0,iRet = 0;

    fd = open(FName,O_RDONLY);
    if(fd == -1)
    {
        printf("unable to open file\n");
        return;
    }
    
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        write(1,Buffer,iRet);
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);
}
int main()
{
    char FileName[30];

    printf("Enter file name : \n");
    scanf("%[^'\n']s",FileName);

    ReadFile(FileName);
    return 0;
}