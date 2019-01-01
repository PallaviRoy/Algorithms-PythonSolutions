
str = "Mr John Smith   "
n = 13

str = str.strip()

print(str)

for s in str:  
    str = str.replace(" ", "%20")

print(str)