
def fibonacci(i):
    if (i == 0 or i ==1):
        return i
    return fibonacci(i-1) + fibonacci(i-2)

print(fibonacci(8))

