# Sistema de votação.

registro = candidato = quantidade_v1 = quantidade_v2 = quantidade_v3 = quantidade_v4 = 0
branco = 0
nome_candidato1 = str(input("Insira aqui o nome do candidato 1:"))
nome_candidato2 = str(input("Insira aqui o nome do candidato 2:"))
nome_candidato3 = str(input("Insira aqui o nome do candidato 3:"))
nome_candidato4 = str(input("Insira aqui o nome do candidato 4:"))


while registro != -1:
    registro = int(
        input("Insira o código do candidato: (digite -1 se quiser encerrar o programa)"))
    if registro == -1:
        break
    titulo = int(input("Insira aqui o número do título de eleitor:"))
    nome = str(input("Insira aqui o nome do eleitor:"))
    voto = int(input("Insira aqui para quem vai o seu voto: (digite 1 para votar no candidato 1, 2 no candidato 2, 3 no candidato 3, 4 no candidato 4, 0 se o voto for branco ou qualquer outro número se o voto for nulo)"))
    if voto == 1:
        candidato = nome_candidato1
        quantidade_v1 = quantidade_v1 + 1
    elif voto == 2:
        candidato = nome_candidato2
        quantidade_v2 = quantidade_v2 + 1
    elif voto == 3:
        candidato = nome_candidato3
        quantidade_v3 = quantidade_v3 + 1
    elif voto == 4:
        candidato = nome_candidato4
        quantidade_v4 = quantidade_v4 + 1
    elif voto == 0:
        candidato = branco
    pausa = str(
        input("Deseja finalizar a colocação dos dados? S para sim e N para não:"))
    if pausa == "S":
        break

print("Nome dos candidatos envolvidos nessa eleição: ", nome_candidato1,
      nome_candidato2, nome_candidato3, nome_candidato4)
print("A quantidade total de votos do candidato 1 foi:", quantidade_v1)
print("A quantidade total de votos do candidato 2 foi:", quantidade_v2)
print("A quantidade total de votos do candidato 3 foi:", quantidade_v3)
print("A quantidade total de votos do candidato 4 foi:", quantidade_v4)
