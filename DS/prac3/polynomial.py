class polynomial:
    def __init__(self, coefficient=None, power=None):
        self.coefficient = coefficient
        self.power = power
        self.head = None
        self.next = None

    def append(self, coefficient, power):
        newNode = polynomial(coefficient, power)

        if self.head is None:
            self.head = newNode
        else:
            current = self.head
            while current:
                if current.next is None:
                    current.next = newNode
                    return
                current = current.next

    def display(self):
        current = self.head

        while current is not None:
            print(f"{current.coefficient} x^ {current.power}", end="")

            if current.next is not None:
                print(" + ", end="")

            current = current.next
        print()

p1 = polynomial()

p1.append(5,3)
p1.append(2,1)
p1.append(3,0)

p2 = polynomial()

p2.append(4,2)
p2.append(3,2)
p2.append(2,1)

print("First Polynomial: ")
p1.display()

print("Second Polynomial: ")
p2.display()class polynomial:
    def __init__(self, coefficient=None, power=None):
        self.coefficient = coefficient
        self.power = power
        self.head = None
        self.next = None

    def append(self, coefficient, power):
        newNode = polynomial(coefficient, power)

        if self.head is None:
            self.head = newNode
        else:
            current = self.head
            while current:
                if current.next is None:
                    current.next = newNode
                    return
                current = current.next

    def display(self):
        current = self.head

        while current is not None:
            print(f"{current.coefficient} x^ {current.power}", end="")

            if current.next is not None:
                print(" + ", end="")

            current = current.next
        print()

p1 = polynomial()

p1.append(5,3)
p1.append(2,1)
p1.append(3,0)

p2 = polynomial()

p2.append(4,2)
p2.append(3,2)
p2.append(2,1)

print("First Polynomial: ")
p1.display()

print("Second Polynomial: ")
p2.display()