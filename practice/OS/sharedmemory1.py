from multiprocessing import shared_memory

SHARED_MEM_NAME = "Bilal's memory"
SHARED_MEM_SIZE = 4096

def main():
  try:
    shm= shared_memory.SharedMemory(
      name = SHARED_MEM_NAME,
      size=SHARED_MEM_SIZE,
      create = True
    )
    message= "Hey! wassup dev"
    shm.buf[:len(message)] = message.encode("utf-8")
    shm.buf[len(message)] = 0
    print("message written to shared memory: ",message)
    input("press enter to exit!")
  finally:
    shm.close()
    shm.unlink()

if __name__=="__main__":
  main()
  