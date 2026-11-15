function CountSmall(str)
{
    let iCount = 0

    for(let i = 0; i < str.length; i++)
    {
        if(str[i] >= 'a' && str[i] <= 'z')
        {
            iCount++
        }
    }

    return iCount
}

function main()
{
    let name = "Marvellous"
    let iRet = 0

    iRet = CountSmall(name)

    console.log("small characters are : ",iRet)
}

main();