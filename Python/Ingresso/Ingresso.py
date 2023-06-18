# Sistema de desconto de ingressos.

registro = valor_desconto = valor_ingresso = sem_desconto = valor_i_desconto = 0
pessoas1 = pessoas2 = pessoas3 = pessoas4 = 0

lista_nome = []
lista_idade = []
lista_ingresso = []
l_zeroacinco = []
l_seisadoze = []
l_trezeavinte = []
l_secenta = []
l_valornormal = []
l_nomesecenta = []

while registro != -1:
    nome = str(input("Digite aqui o nome do cliente:"))
    lista_nome.append(nome)
    idade = int(input("Digite aqui a idade do cliente:"))
    lista_idade.append(idade)
    if 0 <= idade <= 5:
        valor_desconto = 20 * 0.1
        valor_i_desconto = 20 - valor_desconto
        l_zeroacinco.append(valor_i_desconto)
        pessoas1 += 1
    elif 6 <= idade <= 12:
        valor_desconto = 20 * 0.08
        valor_i_desconto = 20 - valor_desconto
        l_seisadoze.append(valor_i_desconto)
        pessoas2 += 1
    elif 13 <= idade <= 25:
        valor_desconto = 20 * 0.05
        valor_i_desconto = 20 - valor_desconto
        l_trezeavinte.append(valor_i_desconto)
        pessoas3 += 1
    elif idade > 60:
        valor_desconto = 20 * 0.15
        valor_i_desconto = 20 - valor_desconto
        l_secenta.append(valor_i_desconto)
        l_nomesecenta.append(nome)
        pessoas4 += 1
    else:
        valor_ingresso = valor_ingresso + 20
        l_valornormal.append(valor_ingresso)
        sem_desconto += 1
    registro = int(
        input("Deseja continuar o programa? (Digite 0 para sim e -1 caso não)"))
    if registro == -1:
        break

lista_ingresso.extend(l_zeroacinco)
lista_ingresso.extend(l_seisadoze)
lista_ingresso.extend(l_trezeavinte)
lista_ingresso.extend(l_secenta)
lista_ingresso.extend(l_valornormal)

pessoas_total = pessoas1 + pessoas2 + pessoas3 + pessoas4 + sem_desconto
valor1 = pessoas2 * 100
valor2 = valor1 / pessoas_total

vt_desconto1 = (len(l_zeroacinco)) * valor_i_desconto
vt_desconto2 = (len(l_seisadoze)) * valor_i_desconto
vt_desconto3 = (len(l_trezeavinte)) * valor_i_desconto
vt_desconto4 = (len(l_secenta)) * valor_i_desconto
valortotal_d = vt_desconto1 + vt_desconto2 + vt_desconto3 + vt_desconto4
numero_descontos = pessoas1 + pessoas2 + pessoas3 + pessoas4
media = valortotal_d / numero_descontos

print("A relação dos clientes é: ", lista_nome)
print("A relação das idades é: ", lista_idade)
print("A relação dos valores dos ingressos foi: ", lista_ingresso)
print("A quantidade de clientes que não tiveram desconto foi de: ", sem_desconto)
print("O percentual de pessoas que tiveram o desconto de 8% foi de: ", valor2)
print("A relação de clientes que tem mais de 60 anos é: ", l_nomesecenta)
print("A média do valor de descontos aplicados é: ", media)
