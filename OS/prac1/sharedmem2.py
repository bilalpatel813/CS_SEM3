from multiprocessing import shared_memory

SHARED_MEM_NAME =  "my_shared_memory"

def main():
    try:
        shm = shared_memory.SharedMemory(name = SHARED_MEM_NAME)
        message = ""
        i = 0
        while shm.buf[i] != 0:
            message += chr(shm.buf[i])
            i += 1

        print("Date read to Shared memory", message)
        shm.close()

    except FileNotFoundError:
        print("Shared memo not found")

if __name__ == "__main__":
    main()