#include<iostream>
using namespace std;

#pragma pack(1)
template <class T>
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

template <class T>
class DoublyCL
{
    private:
        struct node<T>* first;
        struct node<T>* last;
        int iCount;

    public:
        DoublyCL();
        
        void Display();
        int Count();

        void InsertFirst(T iNo);
        void InsertLast(T iNo);
        void InsertAtPos(T iNo,T iPos);
        
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(T iPos);
};

template <class T>
DoublyCL<T> :: DoublyCL()
{
    cout<<"inside constructor\n";

    first = NULL;
    last = NULL;
    iCount = 0;
}

template <class T>
void DoublyCL<T> :: Display()
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

template <class T>
int DoublyCL<T> :: Count()
{
    return iCount;
}

template <class T>
void DoublyCL<T> :: InsertFirst(T iNo)
{
    struct node<T>* newn = NULL;

    newn = new struct node<T>;

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

template <class T>
void DoublyCL<T> :: InsertLast(T iNo)
{
    struct node<T>* newn = NULL;

    newn = new struct node<T>;

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

template <class T>
void DoublyCL<T> :: InsertAtPos(T iNo,T iPos)
{
    struct node<T>* newn = NULL;
    struct node<T>* temp = NULL;

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
        newn = new struct node<T>;

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

template <class T>
void DoublyCL<T> :: DeleteFirst()
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

template <class T>
void DoublyCL<T> :: DeleteLast()
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

template <class T>
void DoublyCL<T> :: DeleteAtPos(T iPos)
{
    
    struct node<T>* temp = NULL;

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

    DoublyCL <int>dobj;
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