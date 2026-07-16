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
               
sll = Singlylinkedlist()
sll.append(100)
sll.append(200)
sll.append(300)
sll.traverse()