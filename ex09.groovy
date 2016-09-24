def each(arr, cl) {
    for (def valor in arr) {
        cl(valor)
    }
}

/*def cl = { println it }
each([1,3,7], cl)*/

//each(1..9, { println it })

each(1..9) { 
    println it 
}
