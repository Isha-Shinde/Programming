#include<stdio.h>  //1
#include<stdlib.h>
 
#pragma pack(1)
struct node //2
{
    int data;
    struct node *next;
    struct node *prev;           // $
};
// 3
typedef struct node NODE;        
typedef struct node* PNODE;
typedef struct node** PPNODE;

// 5
int Count(PNODE first)
{
   return 0;
}

void Display(PNODE first)
{

}

void InsertFirst(PPNODE first,int iNo)
{

}

void InsertLast(PPNODE first,int iNo)
{
    
}

void InsertAtPos(PPNODE first,int iNo,int iPos)
{
    
}

void DeleteFirst(PPNODE first)
{

}

void DeleteLast(PPNODE first)
{
    
}
void DeleteAtPos(PPNODE first,int iPos)
{
    
}
int main()
{    // 4
    PNODE head = NULL;

    return 0;
}