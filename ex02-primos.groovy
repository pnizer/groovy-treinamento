
for (def i in 0..100) {
    if (i <= 1) {
        continue
    }
    
    if (i == 2) {
        println i
    } else {
        def ehPrimo = true
        for(def j in 2..<i) {
            if (i % j == 0) {
                ehPrimo = false
                break
            }
        }
        if (ehPrimo) {
            println i
        }
    }
}
