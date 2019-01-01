
string = "cccccz"

readptr = 1
writeptr = 0

string = list(string)

print("Original")
for s in string:
    print(s)

while(readptr > writeptr and readptr<len(string)):
    if string[readptr] == string[writeptr]:
        readptr += 1
    else:
        count = readptr - writeptr
        writeptr += 1
        string[writeptr] = str(count)
        writeptr += 1
        string[writeptr] = string[readptr]
        writeptr += 1
        readptr += 1        

while(writeptr < len(string)):
    string[writeptr] = ""
    writeptr += 1

print("Compressed")

string = "".join(string)

print(string)