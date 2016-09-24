def usuario = [nome: 'Philippe', github: 'http://github.com/pnizer']
//def usuario = [github: 'http://github.com/pnizer']

def displayNome = usuario.nome ?: "Anônimo"

println "Olá, ${displayNome}"
