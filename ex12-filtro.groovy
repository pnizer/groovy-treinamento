def ehPrimo = { i ->
    if (i <= 1) {
        return false
    }
    
    if (i == 2) {
        return true
    } else {
        def ehPrimo = true
        for(def j in 2..<i) {
            if (i % j == 0) {
                ehPrimo = false
                break
            }
        }
        return ehPrimo
    }
}

// imperativa 
def filtroImp = {lista, cond ->
    def novaLista = []
    lista.each {
        if (cond(it)) {
            novaLista << it
        }
    }
}

// funcional
def filtro
filtro = { lista, cond, acc = [] ->
    if (lista.size() == 0) return acc

    if (cond(lista.head()))
        filtro(lista.tail(), cond, acc + lista.head())
    else
        filtro(lista.tail(), cond, acc)
}

//println filtro(1..100, ehPrimo)
println((1..100).findAll(ehPrimo))

