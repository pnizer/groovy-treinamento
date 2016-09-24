
def contador = 0
for (def i in 0..1000) {
    if (i % 2 == 0) {
        contador += i
    }
}
println "o resultado é ${contador}"
