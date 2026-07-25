class Node:
    def __init__(self, task):
        self.task = task
        self.next = None

class todoList:
    def __init__(self):
        self.head = None
    
    def add_task(self, task):
        new_node = Node(task)

        if self.head is None:
            self.head = new_node
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = new_node
    
    def show_task(self):
        if self.head is None:
            print("No Tasks yet")
            return
        
        temp = self.head
        count = 1

        while temp:
            print(f"{count}. {temp.task}")
            temp = temp.next
            count += 1

    def delete_task(self, task):
        temp = self.head

        if temp and temp.task == task:
            self.head = temp.next
            return
        
        prev = None

        while temp and temp.task != task:
            prev = temp
            temp = temp.next
        
        if temp is None:
            print("Task not found")
            return
        
        prev.next = temp.next

todo = todoList()

while True:
    print("\n1. Add Task")
    print("2. Show Task")
    print("3. Delete Task")
    print("4. Exit")

    choice = input("Enter your choice(1-4): ")

    if choice == "1":
        task = input("Enter a Task: ")
        todo.add_task(task)
    
    elif choice == "2":
        todo.show_task()
    
    elif choice == "3":
        task = input("Enter task to delete: ")
        todo.delete_task(task)
    
    elif choice == "4":
        print("Exit")
        break

    else:
        print("Invalid choice")