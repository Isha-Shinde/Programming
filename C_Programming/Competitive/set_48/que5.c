/*
    write application which accept file name from user and one string from user.write that string at the end of file.
    Input : Demo.txt  Hello World
*/

#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/stat.h>

#define BUFFER_SIZE 100
void WriteString(char FName[],char str[])
{ 
    int fd = 0;

    fd = open(FName, O_RDWR | O_APPEND);
    if(fd == -1)
    {
        printf("unable to open file\n");
        return;
    }
    else
    {
       write(fd,str,strlen(str));
       printf("String written successfully\n");
    }
      close(fd);
}
int main()
{
    char FileName[30];
    char Arr[20];
    int iRet = 0;

    printf("Enter file name : \n");
    scanf("%[^'\n']s",FileName);
    
    printf("Enter the string : \n");
    scanf(" %[^'\n']s",Arr);

    WriteString(FileName,Arr);
    return 0;
}