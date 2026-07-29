/*
    write application which accept file name from user and read all data from thatfile and display size of file.
    Input : Demo.txt  
*/

#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/stat.h>

#define BUFFER_SIZE 100
int FileSize(char FName[])
{ 
    struct stat sobj;

    stat(FName,&sobj);

    return sobj.st_size;

}
int main()
{
    char FileName[30];
    int iRet = 0;

    printf("Enter file name : \n");
    scanf("%[^'\n']s",FileName);

    iRet = FileSize(FileName);
    printf("size of file is : %d\n",iRet);
    return 0;
}