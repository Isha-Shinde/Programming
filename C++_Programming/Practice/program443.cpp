#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

typedef struct node NODE;
typedef struct node* PNODE;

class DoublyCL
{
    private:
        PNODE first;
        PNODE last;
        int iCount;

    public:
        DoublyCL();
        
        void Display();
        int Count();

        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo,int iPos);
        
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

DoublyCL :: DoublyCL()
{
    cout<<"inside constructor\n";

    first = NULL;
    last = NULL;
    iCount = 0;
}

void DoublyCL :: Display()
{
    if(first == NULL && last == NULL)
    {
        return;
    }

    cout<<" <=> ";
    do
    {
        cout<<"| "<<first->data<<" | <=> ";
        first = first->next;
    }while(first != last->next);

    cout<<"\n";
}
int DoublyCL :: Count()
{
    return iCount;
}

void DoublyCL :: InsertFirst(int iNo)
{
    PNODE newn = NULL;

    newn = new NODE;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        newn->next = first;
        first->prev = newn;
        first = newn;
    }
    last -> next =first;
    first->prev =last;
    iCount++;

}
void DoublyCL :: InsertLast(int iNo)
{
    PNODE newn = NULL;

    newn = new NODE;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        last->next = newn;
        newn->prev = last;
        last = newn;
    }
    last -> next =first;
    first->prev =last;
    iCount++;

}
void DoublyCL :: InsertAtPos(int iNo,int iPos)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    int i = 0;

    if((iPos < 1) || (iPos > iCount+1))
    {
        cout<<"Invalid position\n";
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(iNo);
    }
    else if(iPos == iCount+1)
    {
        InsertLast(iNo);
    }
    else
    {
        newn = new NODE;

        newn->data = iNo;
        newn->next = NULL;
        newn->prev = NULL;

        temp = first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }
        newn->next = temp->next;
        temp->next->prev = newn;
        temp->next = newn;
        newn->prev = temp;

        iCount++;
    }
}

void DoublyCL :: DeleteFirst()
{
    if(first == NULL && last == NULL)
    {
        return;
    }
    else if(first == last)
    {
        delete first;
        first = NULL;
        last = NULL;
    }
    else
    {
        first = first->next;
        delete last->next;
    }
    
        last->next = first;
        first->prev = last;
        iCount--;
}
void DoublyCL :: DeleteLast()
{
    if(first == NULL && last == NULL)
    {
        return;
    }
    else if(first == last)
    {
        delete first;
        first = NULL;
        last = NULL;
    }
    else
    {
        last = last->prev;
        delete last->next;
    }
    
        last->next = first;
        first->prev = last;
        iCount--;

}
void DoublyCL :: DeleteAtPos(int iPos)
{
    
    PNODE temp = NULL;

    int i = 0;

    if((iPos < 1) || (iPos > iCount))
    {
        cout<<"Invalid position\n";
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst();
    }
    else if(iPos == iCount)
    {
        DeleteLast();
    }
    else
    {
        temp = first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }
        temp->next = temp->next->next;
        delete temp->next->prev;
        temp->next->prev = temp;

        iCount--;
    }

}


int main()
{

    DoublyCL dobj;
    int iRet = 0;

    dobj.InsertFirst(101);
    dobj.InsertFirst(51);
    dobj.InsertFirst(21);
    dobj.InsertFirst(11);

    dobj.Display();
    iRet = dobj.Count();
    cout<<"number of nodes are :"<<iRet<<"\n";

    
    dobj.InsertLast(111);
    dobj.InsertLast(121);

    dobj.Display();
    iRet = dobj.Count();
    cout<<"number of nodes are :"<<iRet<<"\n";

    dobj.DeleteFirst();

    dobj.Display();
    iRet = dobj.Count();
    cout<<"number of nodes are :"<<iRet<<"\n";
      
    dobj.DeleteLast();

    dobj.Display();
    iRet = dobj.Count();
    cout<<"number of nodes are :"<<iRet<<"\n";
    
    dobj.InsertAtPos(105,4);

    dobj.Display();
    iRet = dobj.Count();
    cout<<"number of nodes are :"<<iRet<<"\n";

    dobj.DeleteAtPos(4);

    dobj.Display();
    iRet = dobj.Count();
    cout<<"number of nodes are :"<<iRet<<"\n";

    return 0;
}