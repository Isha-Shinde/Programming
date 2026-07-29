/*
    write a program which accept file from user and count number of capital characters from that file.

    Input : Demo.txt  

*/

#include<stdio.h>
#include<string.h>
#include<fcntl.h>

#define BUFFER_SIZE 100
int CountCapital(char FName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0,iRet = 0, i = 0, iCount = 0;

    fd = open(FName,O_RDONLY);
    if(fd == -1)
    {
        printf("unable to open file\n");
        return -1;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] >= 'A' && Buffer[i] <= 'Z')
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

    printf("Enter file name : \n");
    scanf("%[^'\n']s",FileName);

    iRet = CountCapital(FileName);
    printf("Number of capital letters are :%d\n",iRet);
    return 0;
}