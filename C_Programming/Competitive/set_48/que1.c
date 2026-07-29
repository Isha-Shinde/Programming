/*
    write application which accept file name form user and open that file in read mode.

    Input : Demo.txt  

*/

#include<stdio.h>
#include<string.h>
#include<fcntl.h>

void FileOpen(char FName[])
{
    int fd = 0;

    fd = open(FName,O_RDONLY);
    if(fd == -1)
    {
        printf("unable to open file\n");
        return;
    }
    else
    {
        printf("file opend successfully\n");
    }
    close(fd);
}
int main()
{
    char FileName[30];

    printf("Enter file name : \n");
    scanf("%[^'\n']s",FileName);

    FileOpen(FileName);
    return 0;
}