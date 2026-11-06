function SumDigits(No)
{
    let iSum = 0
    let iDigit = 0

    while(No != 0)
    {
        iDigit = No % 10
        iSum = iSum + iDigit
        No = No / 10
    }

    return iSum
}

function main()
{
    let iRet = 0;

    iRet = SumDigits(257)

    console.log("Summation of digits : ",iRet);
}

main();