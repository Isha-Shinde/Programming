var no = 11

{
    var x = 21
}

console.log(no)
console.log(x)

/*
    var is not block scoped
    even though x is declared inside {}, you can access it outside the block
    var is function-scoped (or global scoped when declared outside a function )
*/