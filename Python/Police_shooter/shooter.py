total_atiradores = 0
atirador_elite = 0

H_acerto = 0

N_atiradoras = 0
atiradoras_distancia = 0

M_distancia = 9999999
M_nome = ''
M_sexo = ''

P_distancia = 0
P_nome = ''
P_sexo = ''

opcao = 1

while opcao != 0:
    print()
    nome = input('Qual o nome do atirador?')
    sexo = input('Qual o sexo do atirador? [M/F]')
    distancia = int(input('Qual a distância do tiro até o alvo?'))
    if distancia < 1:
        atirador_elite += 1
    if distancia < M_distancia:
        M_distancia = distancia
        M_nome = nome
        M_sexo = sexo
    if distancia > P_distancia:
        P_distancia = distancia
        P_nome = nome
        P_sexo = sexo
    if sexo == 'M':
        if distancia == 0:
            H_acerto += 1
    if sexo == 'F':
        N_atiradoras += 1
        atiradoras_distancia += distancia
    total_atiradores += 1
    opcao = int(input(
        'Digite 0 para encerrar o programa ou qualquer outo número para continuar'))
print()
print(
    f'Percentual de policiais que receberam o título de atirador de elite: {(atirador_elite*100)/total_atiradores}%')
print()
print(f'Policial que realizou o melhor disparo:')
print(f'Nome: {M_nome}   Sexo: {M_sexo}   Distância: {M_distancia}')
print()
print(f'Policial que realizou o pior disparo:')
print(f'Nome: {P_nome}   Sexo: {P_sexo}   Distância: {P_distancia}')
print()
print(
    f'Média da distância ao alvo obtida pelas atiradoras: {atiradoras_distancia/N_atiradoras}')
