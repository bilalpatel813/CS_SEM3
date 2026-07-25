from multiprocessing import shared_memory

SHARED_MEM_NAME = "my_shared_memory"
SHARED_MEM_SIZE = 4096

def main():
    try:
        shm = shared_memory.SharedMemory(
            name = SHARED_MEM_NAME,
            size = SHARED_MEM_SIZE,
            create= True
        )
        message = "Hello, Shared Memory"
        shm.buf[:len(message)] = message.encode('utf-8')
        shm.buf[len(message)] = 0

        print("Data written to shared memory ", message)

        input("Press to Continue...")
    finally:
        shm.close()
        shm.unlink()

if __name__ == "__main__":
    main()