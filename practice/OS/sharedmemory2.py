from multiprocessing import shared_memory


SHARED_MEM_NAME ="Bilal's memory"
def main():
  try:
    shm=shared_memory.SharedMemory(name=SHARED_MEM_NAME)
    message=""
    i=0
    while shm.buf[i] !=0:
      message += chr(shm.buf[i])
      i+=1

    print("message get from Shared Memory: ",message)
    shm.close()
    input("enter to exit!")

  except FileNotFoundError:
    print("No shared memory founded")


if __name__=='__main__':
  main()