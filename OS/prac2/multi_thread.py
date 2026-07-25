#Multi threading

import threading

def print_cube(num):
    print("Cube: {}" .format(num * num * num))

def print_square(num):
    print("Square: {}" .format(num * num))
  
if __name__ == "_main_":
    print("Done!")

t1 = threading.Thread(target=print_cube, args=(13,))
t2 = threading.Thread(target=print_square, args=(12,))

t1.start()
t2.start()

t1.join()
t2.join()