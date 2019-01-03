def FindTwoSumIterative(sum, arr):

    for i in range(0, len(arr)):
        for j in range(i+1, len(arr)):
            if arr[i]+ arr[j] == sum:
                print(str(arr[i])+", "+str(arr[j]))
                return
    
    print("No such nos.")
    return

def FindTwoSumDict(sum, arr):
    sumdict = {}
    for i in range(0, len(arr)):
        # x + y = sum
        y = sum-arr[i]
        if y in sumdict.keys():
            print(str(arr[i])+", "+str(y))
        else:
            sumdict[arr[i]] = y

def FindTwoSumIterate(sum, arr):
    i=0
    j=len(arr)-1
    arr.sort()

    while(i<j):
        if arr[i]+arr[j] < sum:
            i += 1
        elif arr[i]+arr[j] > sum:
            j -= 1
        else:
            print(str(arr[i]) + ", "+str(arr[j]))
            return


FindTwoSumIterate(10, [-3,-2,0,3,8,6,4,12])