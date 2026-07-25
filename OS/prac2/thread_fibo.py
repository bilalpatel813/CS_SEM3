#Fibonacci threading
import threading

def fibo():
    nterms = int(input("How many Terms?: "))
    n1, n2 = 0, 1
    count = 0
    if nterms <= 0:
        print("Please Enter a positive integer")
    elif nterms == 1:
        print("Fibonacci sequence upto ", nterms, ":")
    else:
        print("Fibonacci Sequence: ")
        while count < nterms:
            print(n1)
            nth = n1 + n2
            n1 = n2
            n2 = nth
            count += 1

if __name__ == "__main__":
    t1 = threading.Thread(target=fibo)
    t1.start()
    t1.join()
    print("Done!")#Single threading
import threading

def fibo():
    nterms = int(input("How many Terms?: "))
    n1, n2 = 0, 1
    count = 0
    if nterms <= 0:
        print("Please Enter a positive integer")
    elif nterms == 1:
        print("Fibonacci sequence upto ", nterms, ":")
    else:
        print("Fibonacci Sequence: ")
        while count < nterms:
            print(n1)
            nth = n1 + n2
            n1 = n2
            n2 = nth
            count += 1

if __name__ == "__main__":
    t1 = threading.Thread(target=fibo)
    t1.start()
    t1.join()
    print("Done!")