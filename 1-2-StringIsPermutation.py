
str = "aabc" #"abc" #"aabc"
pstr = "baca" #"bca" #"baca"

if len(str) == len(pstr):
    dict_str = {}
    dict_pstr = {}

    for s in str:
        if s in dict_str:
            dict_str[s] += 1
        else:
            dict_str[s] = 1

    for ps in pstr:
        if ps in dict_pstr:
            dict_pstr[ps] += 1
        else:
            dict_pstr[ps] = 1

    for s in str:
        if not (s in dict_pstr and dict_str[s] == dict_pstr[s]):
            print("not permutation")
