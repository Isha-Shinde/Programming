import java.util.*;    

class program796
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0;
        int iRet = 0;

        System.out.println("Enter Number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Number of columns : ");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow,iCol);
        
        mobj.Accept();
        mobj.Display();

        iRet = mobj.SummationAll();
        System.out.println("Summation of all elements : "+iRet);
        mobj = null;
        System.gc();
    }
}

class Matrix
{
    protected  int Arr[][];
    protected  int iRow;
    protected int iCol;

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside Matric constructor");
        this.iRow = iRow;
        this.iCol = iCol;
        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; i < iCol ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    public void Display()
    {
        System.out.println("elements of the matrix are : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; i < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow,int iCol)
    {
        super(iRow,iCol);
    }

    public int SummationAll()
    {
        int iSum = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; i < iCol ; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }
}

