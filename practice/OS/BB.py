import threading ,random,time

BUFFER_SIZE = 5
buffer = []
mutex = threading.Lock()
empty = threading.Semaphore(BUFFER_SIZE)#empty space available in buffer
full = threading.Semaphore(0)#item available to consume 

def producer():
  for i in range(10):
    item = random.randint(1,100)

    empty.acquire()
    mutex.acquire()

    buffer.append(item)
    print("Prducer produced: ",item)
    print("Buffer: ",buffer)

    mutex.release()
    full.release()

    time.sleep(random.random())


def consumer():
  for i in range(10):
    mutex.acquire()
    full.acquire()

    item= buffer.pop(0)
    print("consumer consumed: ",item)
    print("BUffer: ",buffer)

    mutex.release()
    empty.release()

    time.sleep(random.random())

if __name__=='__main__':
  producer_thread = threading.Thread(target=producer)
  consumer_thread = threading.Thread(target=consumer)

  producer_thread.start()
  consumer_thread.start()
  producer_thread.join()
  consumer_thread.join()

  print("program complpeted !!")
  
    
    

  