import threading
import time
import random

BUFFER_SIZE = 5
buffer = []
mutex = threading.Lock()
empty = threading.Semaphore(BUFFER_SIZE)
full = threading.Semaphore(0)

def Producer():
    for i in range(10):
        item = random.randint(1,100)

        empty.acquire()
        mutex.acquire()

        buffer.append(item)
        print("producer Produced:", item)
        print("Buffer:", buffer)

        mutex.release()
        full.release()

        time.sleep(random.random())

def Consumer():
    for i in range(10):
        full.acquire()
        mutex.acquire()

        item = buffer.pop(0)
        print("Consumer Consumed:", item)
        print("Buffer:", buffer)

        mutex.release()
        empty.release()

        time.sleep(random.random())


if __name__ == '__main__':
    producer_thread = threading.Thread(target = Producer)
    Consumer_thread = threading.Thread(target = Consumer)

    producer_thread.start()
    Consumer_thread.start()

    producer_thread.join()
    Consumer_thread.join()

    print("Program Completed.")