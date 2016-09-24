class Pessoa {
    def primeiroNome
    def ultimoNome

    Pessoa(primeiroNome, ultimoNome) {
        this.primeiroNome = primeiroNome
        this.ultimoNome = ultimoNome
    }

    def getNomeCompleto() {
        return "${primeiroNome} ${ultimoNome}" 
    }

    def setNomeCompleto(valor) {
        primeiroNome = valor.split(" ")[0]
        ultimoNome = valor.split(" ")[1]
    }
}

def p = new Pessoa('João', 'Silva')
println p.primeiroNome
println p.nomeCompleto

p.nomeCompleto = "Ricardo Silva"
println p.primeiroNome

