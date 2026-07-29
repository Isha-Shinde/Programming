/*
    write application which accept file name from user and create that file.

    Input : Demo.txt  

*/

#include<stdio.h>
#include<string.h>
#include<fcntl.h>

#define BUFFER_SIZE 100
void FileCreate(char FName[])
{
    int fd = 0;

    fd = creat(FName,0777);
    if(fd == -1)
    {
        printf("unable to open file\n");
        return;
    }
    else
    {
        printf("file created successfully\n");
    }
    close(fd);
}
int main()
{
    char FileName[30];

    printf("Enter file name : \n");
    scanf("%[^'\n']s",FileName);

    FileCreate(FileName);
    return 0;
}