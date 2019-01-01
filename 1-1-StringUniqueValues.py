
str = "abcdae"

#using another data structure

dict = {}
for s in str:
    if s in dict:
        print("string not unique")
        break
    else:
        dict[s] = 1


#not using another DS
for s in str:
    count = str.count(s)
    if count>1:
        print("string not unique")
        break