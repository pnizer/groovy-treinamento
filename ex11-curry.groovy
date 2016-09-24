def mult = { x, y -> x * y }
println mult(3, 5)

def multPor10 = mult.ncurry(1, 10)
println multPor10(4)
println multPor10(3)
println multPor10(30)

