import LinkedListImplement

class StackImp:

    def __init__(self):
        self.StackLL = LinkedListImplement.LinkedListImp()

    def push(self, value):
        self.StackLL.insert(value)

    def pop(self):
        current = self.StackLL.start
        
        if (current.next ==None):
            current.value = None
        
        else:
            while (current.next != None):
                if (current.next.next == None):
                    current.next = current.next.next
                    self.StackLL.end = current
                    break
                current = current.next
        self.printStack()

    def printStack(self):
        print("\nstack:")
        self.StackLL.printLL()

TestStack =StackImp()

TestStack.push(1)
TestStack.push(2)
TestStack.push(3)
TestStack.push(4)
TestStack.push(5)

TestStack.printStack()

TestStack.pop()
TestStack.pop()
TestStack.pop()

TestStack.pop()

TestStack.pop()