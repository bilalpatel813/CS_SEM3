class Singlylinkedlist:
    def __init__(self, val=None):
        self.val = val
        self.next = None
        self.head = None
    def append(self, data):
        newnode = Singlylinkedlist(data)
        if not self.head:
            self.head = newnode
        else:
            current =self.head
            while current.next is not None:
                current = current.next
            current.next =newnode
    def traverse(self):
         if self.head ==None:
             print("singly linked list is empty")
         else:
             current =  self.head
             while current is not None:
                 print(current.val, end= " ")
                 current = current.next
             print()
    def prepend(self,data):
        newnode = Singlylinkedlist(data)
        if not self.head:
            self.head = newnode
        else:
            newnode.next = self.head
            self.head  = newnode
    def search(self,key):
        current  = self.head
        while current is  not None:
            if current.val== key:
                print("found : ",key)
                return
        else:
            current = current.next
            print("Not found")
    def delete(self,key):
        if not self.head:
            print("list is empty")
        else:
            current = self.head
            while current is not None:
                if current.next == key:
                    current.next = current.next.next
                    return
                current =current.next
            print(key,"Not found")
           
sll = Singlylinkedlist()
sll.append(100)
sll.append(200)
sll.append(300)
sll.traverse()
sll.prepend(1500)
print("After prepend")
sll.traverse()
sll.search(1500)
sll.delete(1500)
sll.traverse()