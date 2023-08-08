pares = impares = positivos = negativos = dividindo = 0

for i in range(5):
    n = int(input())
    dividindo = n % 2
    if dividindo == 0:
        pares += 1
    if dividindo != 0:
        impares += 1
    if n < 0:
        negativos += 1
    if n > 0:
        positivos += 1

print("Valores pares: ", pares)
print("Valores impares: ", impares)
print("Valores positivos: ", positivos)
print("Valores negativos: ", negativos)
