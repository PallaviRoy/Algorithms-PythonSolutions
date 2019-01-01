

class node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedListImp:
    def __init__(self):
        self.start = node(None)
        self.end = self.start

    def insert(self, value):
        if (self.end.value == None):
            self.end.value = value
        else:
            self.end.next = node(value)
            self.end = self.end.next
        return self

    def removeItem(self, value):
        current = self.start

        if value == self.start.value:
            print("\nremoving "+ value)
            self.start = self.start.next
            return self
        while (current.next != None):
            if value == current.next.value:
                print("\nremoving "+ value)
                current.next = current.next.next
                break
            current = current.next
        return self

    def printLL(self):        
        next = self.start
        while next != None:
            print(next.value, end="\t")
            next = next.next


#test
# LL = LinkedListImp()
# LL.insert("a")
# LL.insert("b")
# LL.insert("a")
# LL.insert("c")
# LL.insert("d")
# LL.insert("e")

# LL.printLL()

# LL.removeItem("a")

# LL.printLL()
